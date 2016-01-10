package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the h_content_checking database table.
 * 
 */
@Entity
@Table(name="h_content_checking")
@NamedQuery(name="HContentChecking.findAll", query="SELECT h FROM HContentChecking h")
public class HContentChecking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="CHECK_LEVEL")
	private int checkLevel;

	@Column(name="OPERATOR_NAME")
	private String operatorName;

	@Column(name="PERSON_ID")
	private BigInteger personId;

	@Column(name="PROC_GROUP_ID")
	private BigInteger procGroupId;

	@Column(name="REF_DN")
	private String refDn;

	@Column(name="SUBJECT_ID")
	private BigInteger subjectId;

	@Column(name="UNION_CHECK")
	private String unionCheck;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public HContentChecking() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCheckLevel() {
		return this.checkLevel;
	}

	public void setCheckLevel(int checkLevel) {
		this.checkLevel = checkLevel;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public BigInteger getPersonId() {
		return this.personId;
	}

	public void setPersonId(BigInteger personId) {
		this.personId = personId;
	}

	public BigInteger getProcGroupId() {
		return this.procGroupId;
	}

	public void setProcGroupId(BigInteger procGroupId) {
		this.procGroupId = procGroupId;
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

	public String getUnionCheck() {
		return this.unionCheck;
	}

	public void setUnionCheck(String unionCheck) {
		this.unionCheck = unionCheck;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}