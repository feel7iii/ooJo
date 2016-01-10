package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the h_content_tj database table.
 * 
 */
@Entity
@Table(name="h_content_tj")
@NamedQuery(name="HContentTj.findAll", query="SELECT h FROM HContentTj h")
public class HContentTj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String description;

	@Column(name="REF_DN")
	private String refDn;

	@Column(name="SUBJECT_ID")
	private BigInteger subjectId;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public HContentTj() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRefDn() {
		return this.refDn;
	}

	public void setRefDn(String refDn) {
		this.refDn = refDn;
	}

	public BigInteger getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(BigInteger subjectId) {
		this.subjectId = subjectId;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}