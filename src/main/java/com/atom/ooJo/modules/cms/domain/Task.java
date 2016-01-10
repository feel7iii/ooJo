package com.atom.ooJo.modules.cms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.atom.ooJo.common.domain.CPerson;
import com.atom.ooJo.common.domain.IdEntity;

@Entity
@Table(name = "SS_TASK")
public class Task extends IdEntity {

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID", nullable = false)
	private CPerson CPerson;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CPerson getCPerson() {
		return CPerson;
	}

	public void setCPerson(CPerson cPerson) {
		CPerson = cPerson;
	}

}
