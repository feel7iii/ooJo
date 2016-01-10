package com.atom.ooJo.common.fileup;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.atom.ooJo.common.domain.UpFile;

@Component
@Transactional
public class FileUploadService {

	@Autowired
	private FileUploadDao fileUploadDao;

	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = true)
	public Page<UpFile> listFiles(int pageNumber, int pageSize) {

		return fileUploadDao.findAll(new PageRequest(pageNumber - 1, pageSize));
	}

	@Transactional(readOnly = true)
	public UpFile getFile(Long id) {
		return fileUploadDao.findOne(id);
	}

	@Transactional
	public UpFile saveFile(UpFile upFile) {
		return fileUploadDao.save(upFile);
	}

}
