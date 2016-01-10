package com.atom.ooJo.common.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atom.ooJo.common.domain.CPerson;

@Service
public class CPersonService {

	@Autowired
	private CPersonRepository cpersonRepository;

	public CPerson login(String email, String loginPassword) {
		return cpersonRepository.findByEmailAndLoginPassword(email, loginPassword);
	}

	public CPerson findUserByLoginName(String loginName) {
		return cpersonRepository.findByLoginName(loginName);
	}

}