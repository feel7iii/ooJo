package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the a_content_pub database table.
 * 
 */
@Entity
@Table(name="a_content_pub")
@NamedQuery(name="AContentPub.findAll", query="SELECT a FROM AContentPub a")
public class AContentPub implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String author;

	@Column(name="AUTHOR_NAME")
	private String authorName;

	private String description;

	@Column(name="HAVE_TITLE_PIC")
	private String haveTitlePic;

	@Column(name="MODIFY_TIME")
	private String modifyTime;

	@Column(name="PUBLISH_TIME")
	private String publishTime;

	@Column(name="REF_SUB_ID")
	private BigInteger refSubId;

	@Column(name="SC_DN")
	private String scDn;

	@Column(name="SC_FULL_NAME")
	private String scFullName;

	@Column(name="SC_ID")
	private BigInteger scId;

	@Column(name="SECURITY_LEVEL")
	private String securityLevel;

	@Column(name="START_TIME")
	private String startTime;

	@Column(name="SUB_DN")
	private String subDn;

	private String title;

	private String type;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public AContentPub() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHaveTitlePic() {
		return this.haveTitlePic;
	}

	public void setHaveTitlePic(String haveTitlePic) {
		this.haveTitlePic = haveTitlePic;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public BigInteger getRefSubId() {
		return this.refSubId;
	}

	public void setRefSubId(BigInteger refSubId) {
		this.refSubId = refSubId;
	}

	public String getScDn() {
		return this.scDn;
	}

	public void setScDn(String scDn) {
		this.scDn = scDn;
	}

	public String getScFullName() {
		return this.scFullName;
	}

	public void setScFullName(String scFullName) {
		this.scFullName = scFullName;
	}

	public BigInteger getScId() {
		return this.scId;
	}

	public void setScId(BigInteger scId) {
		this.scId = scId;
	}

	public String getSecurityLevel() {
		return this.securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubDn() {
		return this.subDn;
	}

	public void setSubDn(String subDn) {
		this.subDn = subDn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}