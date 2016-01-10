package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the h_publish_define database table.
 * 
 */
@Entity
@Table(name="h_publish_define")
@NamedQuery(name="HPublishDefine.findAll", query="SELECT h FROM HPublishDefine h")
public class HPublishDefine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="CLIENT_ID")
	private BigInteger clientId;

	@Column(name="CMS_SERVER_NODE_ID")
	private BigInteger cmsServerNodeId;

	private String description;

	private String domain;

	@Column(name="EX_CLIENT_NAME")
	private String exClientName;

	@Column(name="PUBLISH_STATUS")
	private String publishStatus;

	private String status;

	private String type;

	@Column(name="version_id")
	private BigInteger versionId;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject;

	public HPublishDefine() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getClientId() {
		return this.clientId;
	}

	public void setClientId(BigInteger clientId) {
		this.clientId = clientId;
	}

	public BigInteger getCmsServerNodeId() {
		return this.cmsServerNodeId;
	}

	public void setCmsServerNodeId(BigInteger cmsServerNodeId) {
		this.cmsServerNodeId = cmsServerNodeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getExClientName() {
		return this.exClientName;
	}

	public void setExClientName(String exClientName) {
		this.exClientName = exClientName;
	}

	public String getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
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

	public BigInteger getVersionId() {
		return this.versionId;
	}

	public void setVersionId(BigInteger versionId) {
		this.versionId = versionId;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}