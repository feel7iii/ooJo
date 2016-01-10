package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the a_content_related database table.
 * 
 */
@Entity
@Table(name="a_content_related")
@NamedQuery(name="AContentRelated.findAll", query="SELECT a FROM AContentRelated a")
public class AContentRelated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String type;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent1;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_RELATED_ID")
	private AContent AContent2;

	public AContentRelated() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AContent getAContent1() {
		return this.AContent1;
	}

	public void setAContent1(AContent AContent1) {
		this.AContent1 = AContent1;
	}

	public AContent getAContent2() {
		return this.AContent2;
	}

	public void setAContent2(AContent AContent2) {
		this.AContent2 = AContent2;
	}

}