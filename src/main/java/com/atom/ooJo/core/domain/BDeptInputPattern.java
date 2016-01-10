package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the b_dept_input_pattern database table.
 * 
 */
@Entity
@Table(name="b_dept_input_pattern")
@NamedQuery(name="BDeptInputPattern.findAll", query="SELECT b FROM BDeptInputPattern b")
public class BDeptInputPattern implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Lob
	@Column(name="HTML_CONTENT")
	private String htmlContent;

	private String name;

	//bi-directional many-to-one association to BDeptInputPart
	@OneToMany(mappedBy="BDeptInputPattern")
	private Set<BDeptInputPart> BDeptInputParts;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private BDept BDept;

	public BDeptInputPattern() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BDeptInputPart> getBDeptInputParts() {
		return this.BDeptInputParts;
	}

	public void setBDeptInputParts(Set<BDeptInputPart> BDeptInputParts) {
		this.BDeptInputParts = BDeptInputParts;
	}

	public BDeptInputPart addBDeptInputPart(BDeptInputPart BDeptInputPart) {
		getBDeptInputParts().add(BDeptInputPart);
		BDeptInputPart.setBDeptInputPattern(this);

		return BDeptInputPart;
	}

	public BDeptInputPart removeBDeptInputPart(BDeptInputPart BDeptInputPart) {
		getBDeptInputParts().remove(BDeptInputPart);
		BDeptInputPart.setBDeptInputPattern(null);

		return BDeptInputPart;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

}