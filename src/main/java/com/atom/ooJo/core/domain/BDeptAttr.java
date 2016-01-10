package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the b_dept_attr database table.
 * 
 */
@Entity
@Table(name="b_dept_attr")
@NamedQuery(name="BDeptAttr.findAll", query="SELECT b FROM BDeptAttr b")
public class BDeptAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="LIST_CHANGE")
	private String listChange;

	@Column(name="LIST_INIT_NUM")
	private int listInitNum;

	@Column(name="META_ID")
	private BigInteger metaId;

	@Column(name="MUST_INPUT")
	private String mustInput;

	private String name;

	private int pos;

	@Column(name="SHORT_NAME")
	private String shortName;

	@Column(name="TREE_CODE")
	private String treeCode;

	//bi-directional many-to-one association to BDeptAttr
	@ManyToOne
	@JoinColumn(name="FATHER_ID")
	private BDeptAttr BDeptAttr;

	//bi-directional many-to-one association to BDeptAttr
	@OneToMany(mappedBy="BDeptAttr")
	private Set<BDeptAttr> BDeptAttrs;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private BDept BDept;

	public BDeptAttr() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getListChange() {
		return this.listChange;
	}

	public void setListChange(String listChange) {
		this.listChange = listChange;
	}

	public int getListInitNum() {
		return this.listInitNum;
	}

	public void setListInitNum(int listInitNum) {
		this.listInitNum = listInitNum;
	}

	public BigInteger getMetaId() {
		return this.metaId;
	}

	public void setMetaId(BigInteger metaId) {
		this.metaId = metaId;
	}

	public String getMustInput() {
		return this.mustInput;
	}

	public void setMustInput(String mustInput) {
		this.mustInput = mustInput;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTreeCode() {
		return this.treeCode;
	}

	public void setTreeCode(String treeCode) {
		this.treeCode = treeCode;
	}

	public BDeptAttr getBDeptAttr() {
		return this.BDeptAttr;
	}

	public void setBDeptAttr(BDeptAttr BDeptAttr) {
		this.BDeptAttr = BDeptAttr;
	}

	public Set<BDeptAttr> getBDeptAttrs() {
		return this.BDeptAttrs;
	}

	public void setBDeptAttrs(Set<BDeptAttr> BDeptAttrs) {
		this.BDeptAttrs = BDeptAttrs;
	}

	public BDeptAttr addBDeptAttr(BDeptAttr BDeptAttr) {
		getBDeptAttrs().add(BDeptAttr);
		BDeptAttr.setBDeptAttr(this);

		return BDeptAttr;
	}

	public BDeptAttr removeBDeptAttr(BDeptAttr BDeptAttr) {
		getBDeptAttrs().remove(BDeptAttr);
		BDeptAttr.setBDeptAttr(null);

		return BDeptAttr;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

}