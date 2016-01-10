package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_content_subject database table.
 * 
 */
@Entity
@Table(name="h_content_subject")
@NamedQuery(name="HContentSubject.findAll", query="SELECT h FROM HContentSubject h")
public class HContentSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="CREATE_TIME")
	private String createTime;

	@Column(name="REF_DN")
	private String refDn;

	private String status;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="REF_ID")
	private HSubject HSubject;

	public HContentSubject() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRefDn() {
		return this.refDn;
	}

	public void setRefDn(String refDn) {
		this.refDn = refDn;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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