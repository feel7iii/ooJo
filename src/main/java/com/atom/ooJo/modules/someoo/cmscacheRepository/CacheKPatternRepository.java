package com.atom.ooJo.modules.someoo.cmscacheRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atom.ooJo.core.domain.KPattern;

public interface CacheKPatternRepository extends JpaRepository<KPattern, Long> {

	List<KPattern> findByTypeAndStatus(String type, String status);

	KPattern findById(String value);

}
