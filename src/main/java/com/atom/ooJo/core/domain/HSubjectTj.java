package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_subject_tj database table.
 * 
 */
@Entity
@Table(name="h_subject_tj")
@NamedQuery(name="HSubjectTj.findAll", query="SELECT h FROM HSubjectTj h")
public class HSubjectTj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="AUTO_TJ")
	private String autoTj;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject1;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="TARGET_S_ID")
	private HSubject HSubject2;

	public HSubjectTj() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAutoTj() {
		return this.autoTj;
	}

	public void setAutoTj(String autoTj) {
		this.autoTj = autoTj;
	}

	public HSubject getHSubject1() {
		return this.HSubject1;
	}

	public void setHSubject1(HSubject HSubject1) {
		this.HSubject1 = HSubject1;
	}

	public HSubject getHSubject2() {
		return this.HSubject2;
	}

	public void setHSubject2(HSubject HSubject2) {
		this.HSubject2 = HSubject2;
	}

}