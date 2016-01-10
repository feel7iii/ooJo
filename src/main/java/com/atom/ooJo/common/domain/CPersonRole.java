package com.atom.ooJo.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "C_PERSON_ROLE")
@NamedQuery(name = "CPersonRole.findAll", query = "SELECT c FROM CPersonRole c")
public class CPersonRole extends IdEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID")
	private CPerson CPerson;

	@Column(name = "ROLE")
	private String role;

	@Column(name = "DEPT_ID")
	private String deptId;

	@Column(name = "DEPT_DN")
	private String deptDn;

	@Column(name = "INCLUDE_SON")
	private String includeSon;

	@Column(name = "SECURITY_LEVEL")
	private String securityLevel;

	@Column(name = "POS")
	private String pos;

	@Column(name = "ROLE_NAME")
	private String roleName;

	public CPerson getCPerson() {
		return CPerson;
	}

	public void setCPerson(CPerson cPerson) {
		CPerson = cPerson;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptDn() {
		return deptDn;
	}

	public void setDeptDn(String deptDn) {
		this.deptDn = deptDn;
	}

	public String getIncludeSon() {
		return includeSon;
	}

	public void setIncludeSon(String includeSon) {
		this.includeSon = includeSon;
	}

	public String getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}