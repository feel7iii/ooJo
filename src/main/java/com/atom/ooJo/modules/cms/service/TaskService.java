package com.atom.ooJo.modules.cms.service;

import org.springframework.data.domain.Page;

import com.atom.ooJo.modules.cms.domain.Task;

public interface TaskService {

	Page<Task> findByTitle(Integer pageNum, Integer pageSize);

}
