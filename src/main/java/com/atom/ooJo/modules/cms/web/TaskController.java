package com.atom.ooJo.modules.cms.web;

import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springside.modules.web.Servlets;

import com.atom.ooJo.common.constants.Const;
import com.atom.ooJo.common.useless.PageWrapper;
import com.atom.ooJo.modules.cms.domain.Task;
import com.atom.ooJo.modules.cms.service.TaskService;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value = "/")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	private static Map<String, String> sortTypes = Maps.newLinkedHashMap();
	static {
		sortTypes.put("auto", "自动");
		sortTypes.put("title", "标题");
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getSomePage(Model ooModel, @RequestParam(value = "page", defaultValue = "1") int pageNum, ServletRequest request) {
		PageWrapper<Task> page = new PageWrapper<Task>(taskService.findByTitle(pageNum, Const.PAGE_SIZE), "/welcome");
		
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		
		ooModel.addAttribute("page", page);
		ooModel.addAttribute("sortTypes", sortTypes);
		ooModel.addAttribute("searchParams", Servlets.encodeParameterStringWithPrefix(searchParams, "search_"));
		return "welcome";
	}

}
