package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_subject_pub database table.
 * 
 */
@Entity
@Table(name="h_subject_pub")
@NamedQuery(name="HSubjectPub.findAll", query="SELECT h FROM HSubjectPub h")
public class HSubjectPub implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String status;

	@Column(name="SUB_DN")
	private String subDn;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUB_ID")
	private HSubject HSubject;

	public HSubjectPub() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubDn() {
		return this.subDn;
	}

	public void setSubDn(String subDn) {
		this.subDn = subDn;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}