package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the a_content_text database table.
 * 
 */
@Entity
@Table(name="a_content_text")
@NamedQuery(name="AContentText.findAll", query="SELECT a FROM AContentText a")
public class AContentText implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Lob
	@Column(name="HTML_CONTENT")
	private String htmlContent;

	@Column(name="PIC_NAME")
	private String picName;

	@Lob
	@Column(name="TEXT_CONTENT")
	private String textContent;

	@Lob
	@Column(name="TITLE_PIC")
	private byte[] titlePic;

	//bi-directional one-to-one association to AContent
	@OneToOne
	@JoinColumn(name="ID")
	private AContent AContent;

	public AContentText() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHtmlContent() {
		return this.htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getPicName() {
		return this.picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public byte[] getTitlePic() {
		return this.titlePic;
	}

	public void setTitlePic(byte[] titlePic) {
		this.titlePic = titlePic;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}