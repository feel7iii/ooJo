package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_subject_bs database table.
 * 
 */
@Entity
@Table(name="h_subject_bs")
@NamedQuery(name="HSubjectB.findAll", query="SELECT h FROM HSubjectB h")
public class HSubjectB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="SRC_SYSTEM")
	private String srcSystem;

	@Column(name="TARGET_DN")
	private String targetDn;

	@Column(name="TARGET_SUB_NAME")
	private String targetSubName;

	@Column(name="TARGET_SYSTEM")
	private String targetSystem;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject;

	public HSubjectB() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrcSystem() {
		return this.srcSystem;
	}

	public void setSrcSystem(String srcSystem) {
		this.srcSystem = srcSystem;
	}

	public String getTargetDn() {
		return this.targetDn;
	}

	public void setTargetDn(String targetDn) {
		this.targetDn = targetDn;
	}

	public String getTargetSubName() {
		return this.targetSubName;
	}

	public void setTargetSubName(String targetSubName) {
		this.targetSubName = targetSubName;
	}

	public String getTargetSystem() {
		return this.targetSystem;
	}

	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}