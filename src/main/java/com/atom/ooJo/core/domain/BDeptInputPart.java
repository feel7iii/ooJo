package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the b_dept_input_part database table.
 * 
 */
@Entity
@Table(name="b_dept_input_part")
@NamedQuery(name="BDeptInputPart.findAll", query="SELECT b FROM BDeptInputPart b")
public class BDeptInputPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Lob
	private byte[] content;

	private String name;

	//bi-directional many-to-one association to BDeptInputPattern
	@ManyToOne
	@JoinColumn(name="PATTERN_ID")
	private BDeptInputPattern BDeptInputPattern;

	public BDeptInputPart() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BDeptInputPattern getBDeptInputPattern() {
		return this.BDeptInputPattern;
	}

	public void setBDeptInputPattern(BDeptInputPattern BDeptInputPattern) {
		this.BDeptInputPattern = BDeptInputPattern;
	}

}