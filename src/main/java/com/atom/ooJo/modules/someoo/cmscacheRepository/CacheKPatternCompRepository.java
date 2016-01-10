package com.atom.ooJo.modules.someoo.cmscacheRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atom.ooJo.core.domain.KPatternComp;

public interface CacheKPatternCompRepository extends JpaRepository<KPatternComp, Long> {

	@Query("select kpc from  KPatternComp kpc where kpc.KComponent.id = ?1")
	List<KPatternComp> findByComId(String comId);
}
