package com.atom.ooJo.common.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "C_PERSON")
@NamedQuery(name = "CPerson.findAll", query = "SELECT c FROM CPerson c")
public class CPerson extends IdEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "SSOID")
	private String ssoId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "LOGIN_NAME")
	private String loginName;

	@Column(name = "LOGIN_PASSWORD")
	private String loginPassword;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "CREATE_TIME")
	private String createTime;

	@Column(name = "MODIFY_TIME")
	private String modifyTime;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ROLE_STATUS")
	private String roleStatus;

	@Column(name = "SECURITY_LEVEL")
	private String securityLevel;

	@Column(name = "EMAIL")
	private String email;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "CPerson")
	private Set<CPersonRole> CPersonRoles;

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}

	public String getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<CPersonRole> getCPersonRoles() {
		return CPersonRoles;
	}

	public void setCPersonRoles(Set<CPersonRole> cPersonRoles) {
		CPersonRoles = cPersonRoles;
	}

	public CPerson(CPerson cperson) {
		super();
	}

	public CPerson() {
		super();
	}

}