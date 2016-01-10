package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the b_content_subject database table.
 * 
 */
@Entity
@Table(name="b_content_subject")
@NamedQuery(name="BContentSubject.findAll", query="SELECT b FROM BContentSubject b")
public class BContentSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="REF_DN")
	private String refDn;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="REF_ID")
	private BDept BDept;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUB_ID")
	private HSubject HSubject;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public BContentSubject() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRefDn() {
		return this.refDn;
	}

	public void setRefDn(String refDn) {
		this.refDn = refDn;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}