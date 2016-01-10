package com.atom.ooJo.modules.someoo.cmscacheRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atom.ooJo.core.domain.KComponent;

public interface CacheKComponentRepository extends JpaRepository<KComponent, Long> {
	
	List<KComponent> findByCompDefId(String compDefId);
}
