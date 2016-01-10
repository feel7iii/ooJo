package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the a_content_bs database table.
 * 
 */
@Entity
@Table(name="a_content_bs")
@NamedQuery(name="AContentB.findAll", query="SELECT a FROM AContentB a")
public class AContentB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String description;

	@Column(name="TARGET_SYS")
	private String targetSys;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private BDept BDept;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public AContentB() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTargetSys() {
		return this.targetSys;
	}

	public void setTargetSys(String targetSys) {
		this.targetSys = targetSys;
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