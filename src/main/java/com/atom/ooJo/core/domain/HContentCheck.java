package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_content_check database table.
 * 
 */
@Entity
@Table(name="h_content_check")
@NamedQuery(name="HContentCheck.findAll", query="SELECT h FROM HContentCheck h")
public class HContentCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="ACTION_NAME")
	private String actionName;

	@Column(name="ACTION_TIME")
	private String actionTime;

	private String note;

	@Column(name="OPERATOR_NAME")
	private String operatorName;

	@Column(name="REF_DN")
	private String refDn;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public HContentCheck() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionTime() {
		return this.actionTime;
	}

	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getRefDn() {
		return this.refDn;
	}

	public void setRefDn(String refDn) {
		this.refDn = refDn;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}