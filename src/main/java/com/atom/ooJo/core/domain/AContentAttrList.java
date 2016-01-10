package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the a_content_attr_list database table.
 * 
 */
@Entity
@Table(name="a_content_attr_list")
@NamedQuery(name="AContentAttrList.findAll", query="SELECT a FROM AContentAttrList a")
public class AContentAttrList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	//bi-directional many-to-one association to AContentAttr
	@OneToMany(mappedBy="AContentAttrList")
	private Set<AContentAttr> AContentAttrs;

	//bi-directional many-to-one association to AContentAttr
	@ManyToOne
	@JoinColumn(name="ATTR_ID")
	private AContentAttr AContentAttr;

	public AContentAttrList() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<AContentAttr> getAContentAttrs() {
		return this.AContentAttrs;
	}

	public void setAContentAttrs(Set<AContentAttr> AContentAttrs) {
		this.AContentAttrs = AContentAttrs;
	}

	public AContentAttr addAContentAttr(AContentAttr AContentAttr) {
		getAContentAttrs().add(AContentAttr);
		AContentAttr.setAContentAttrList(this);

		return AContentAttr;
	}

	public AContentAttr removeAContentAttr(AContentAttr AContentAttr) {
		getAContentAttrs().remove(AContentAttr);
		AContentAttr.setAContentAttrList(null);

		return AContentAttr;
	}

	public AContentAttr getAContentAttr() {
		return this.AContentAttr;
	}

	public void setAContentAttr(AContentAttr AContentAttr) {
		this.AContentAttr = AContentAttr;
	}

}