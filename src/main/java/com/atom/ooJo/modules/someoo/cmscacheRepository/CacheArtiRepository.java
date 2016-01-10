package com.atom.ooJo.modules.someoo.cmscacheRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atom.ooJo.core.domain.AContent;

public interface CacheArtiRepository extends JpaRepository<AContent, Long> {
	
	// 只查前10000条文章按文章发布时间降序 以免190W量级出现诡异情况
	List<AContent> findTop10000ByOrderByPublishTimeDesc();
}
