package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the b_dept_bs database table.
 * 
 */
@Entity
@Table(name="b_dept_bs")
@NamedQuery(name="BDeptB.findAll", query="SELECT b FROM BDeptB b")
public class BDeptB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="AUTO_BS")
	private String autoBs;

	@Column(name="TARGET_SYS")
	private String targetSys;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="TARGET_SUBJECT_ID")
	private HSubject HSubject;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private BDept BDept1;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="TARGET_DEPT_ID")
	private BDept BDept2;

	public BDeptB() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAutoBs() {
		return this.autoBs;
	}

	public void setAutoBs(String autoBs) {
		this.autoBs = autoBs;
	}

	public String getTargetSys() {
		return this.targetSys;
	}

	public void setTargetSys(String targetSys) {
		this.targetSys = targetSys;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

	public BDept getBDept1() {
		return this.BDept1;
	}

	public void setBDept1(BDept BDept1) {
		this.BDept1 = BDept1;
	}

	public BDept getBDept2() {
		return this.BDept2;
	}

	public void setBDept2(BDept BDept2) {
		this.BDept2 = BDept2;
	}

}