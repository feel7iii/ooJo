package com.atom.ooJo.modules.someoo.cmscacheRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atom.ooJo.core.domain.HContentSubject;

public interface CacheHContentSubjectRepository extends JpaRepository<HContentSubject, Long> {

	@Query("select count(*) from  HContentSubject hcs where hcs.status = ?1 and hcs.refDn = ?2")
	Integer sumContentInDnAndComId(String status, String dn);
	
}
