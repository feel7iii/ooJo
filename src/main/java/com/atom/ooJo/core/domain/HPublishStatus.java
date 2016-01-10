package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the h_publish_status database table.
 * 
 */
@Entity
@Table(name="h_publish_status")
@NamedQuery(name="HPublishStatus.findAll", query="SELECT h FROM HPublishStatus h")
public class HPublishStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="ACT_NAME")
	private String actName;

	@Column(name="ASK_TIME")
	private String askTime;

	@Column(name="CLIENT_NAME")
	private String clientName;

	private String dn;

	@Column(name="OBJECT_ID")
	private BigInteger objectId;

	@Column(name="OBJECT_NAME")
	private String objectName;

	private String status;

	private String type;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject;

	public HPublishStatus() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getAskTime() {
		return this.askTime;
	}

	public void setAskTime(String askTime) {
		this.askTime = askTime;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getDn() {
		return this.dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public BigInteger getObjectId() {
		return this.objectId;
	}

	public void setObjectId(BigInteger objectId) {
		this.objectId = objectId;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}