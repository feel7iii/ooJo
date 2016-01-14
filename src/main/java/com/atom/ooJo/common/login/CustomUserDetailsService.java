//package com.atom.ooJo.common.login;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.atom.ooJo.common.domain.CPerson;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private CPersonService cpersonService;
//
//	@Override
//	public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
//		// CPerson对应数据库中的用户表，是最终存储用户和密码的表，可自定义
//		CPerson cperson = cpersonService.findUserByLoginName(loginName);
//		if (cperson == null) {
//			throw new UsernameNotFoundException("UserName " + loginName + " Not Found!");
//		}
//		// UserRepositoryUserDetails实现UserDetails并将CPerson的LoginName映射为Username
//		return new UserRepositoryUserDetails(cperson);
//	}
//
//}