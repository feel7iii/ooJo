package com.atom.ooJo.common.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atom.ooJo.common.domain.CPerson;

public interface CPersonRepository extends JpaRepository<CPerson, Integer> {

	@Query("select cp from CPerson cp where cp.loginName=?1 and cp.loginPassword=?2")
	CPerson login(String loginName, String loginPassword);

	CPerson findByEmailAndLoginPassword(String email, String loginPassword);

	CPerson findByLoginName(String loginName);
}