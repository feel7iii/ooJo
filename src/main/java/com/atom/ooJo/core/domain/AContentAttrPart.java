package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the a_content_attr_part database table.
 * 
 */
@Entity
@Table(name="a_content_attr_part")
@NamedQuery(name="AContentAttrPart.findAll", query="SELECT a FROM AContentAttrPart a")
public class AContentAttrPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Lob
	private byte[] content;

	@Column(name="CONTENT_TYPE")
	private String contentType;

	@Column(name="FILE_NAME")
	private String fileName;

	//bi-directional one-to-one association to AContentAttr
	@OneToOne
	@JoinColumn(name="ID")
	private AContentAttr AContentAttr;

	public AContentAttrPart() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public AContentAttr getAContentAttr() {
		return this.AContentAttr;
	}

	public void setAContentAttr(AContentAttr AContentAttr) {
		this.AContentAttr = AContentAttr;
	}

}