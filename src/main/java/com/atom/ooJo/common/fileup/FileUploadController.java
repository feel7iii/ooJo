package com.atom.ooJo.common.fileup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.atom.ooJo.common.constants.Const;
import com.atom.ooJo.common.domain.UpFile;

@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {

	@Autowired
	private FileUploadService uploadService;

	@RequestMapping(value = "/up")
	public String home() {

		return "upload/fileUploader";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody List<UpFile> upload(MultipartHttpServletRequest request, HttpServletResponse response) throws IOException {

		// Getting uploaded files from the request object
		Map<String, MultipartFile> fileMap = request.getFileMap();

		// Maintain a list to send back the files info. to the client side
		List<UpFile> upFiles = new ArrayList<UpFile>();

		// Iterate through the map
		for (MultipartFile multipartFile : fileMap.values()) {

			// Save the file to local disk
			saveFileToLocalDisk(multipartFile);

			UpFile fileInfo = getUploadedFileInfo(multipartFile);

			// Save the file info to database
			fileInfo = saveFileToDatabase(fileInfo);

			// adding the file info to the list
			upFiles.add(fileInfo);
		}

		return upFiles;
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String listFiles(@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = Const.PAGE_SIZE + "") int pageSize, Model model) {
		Page<UpFile> upFile = (Page<UpFile>) uploadService.listFiles(pageNumber, pageSize);
		model.addAttribute("fileList", upFile);

		return "upload/listFiles";
	}

	@RequestMapping(value = "/get/{fileId}", method = RequestMethod.GET)
	public void getFile(HttpServletResponse response, @PathVariable Long fileId) {

		UpFile dataFile = uploadService.getFile(fileId);

		File file = new File(dataFile.getLocation(), dataFile.getName());

		try {
			response.setContentType(dataFile.getWhatstype());
			response.setHeader("Content-disposition", "attachment; filename=\"" + dataFile.getName() + "\"");

			FileCopyUtils.copy(FileUtils.readFileToByteArray(file), response.getOutputStream());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void saveFileToLocalDisk(MultipartFile multipartFile) throws IOException, FileNotFoundException {

		String outputFileName = getOutputFilename(multipartFile);

		FileCopyUtils.copy(multipartFile.getBytes(), new FileOutputStream(outputFileName));
	}

	private UpFile saveFileToDatabase(UpFile upFile) {

		return uploadService.saveFile(upFile);
	}

	private String getOutputFilename(MultipartFile multipartFile) {
		// Servlet初始化时执行,如果上传文件目录不存在则自动创建
		if (!new File(Const.UPLOADTEMP).isDirectory()) {
			new File(Const.UPLOADTEMP).mkdirs();
		}
		return Const.UPLOADTEMP + multipartFile.getOriginalFilename();
	}

	private UpFile getUploadedFileInfo(MultipartFile multipartFile) throws IOException {

		UpFile fileInfo = new UpFile();
		fileInfo.setName(multipartFile.getOriginalFilename());
		fileInfo.setSize(multipartFile.getSize());
		fileInfo.setWhatstype(multipartFile.getContentType());
		fileInfo.setLocation(Const.UPLOADTEMP);

		return fileInfo;
	}

}
