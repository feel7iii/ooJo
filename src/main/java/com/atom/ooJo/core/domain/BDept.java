package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the b_dept database table.
 * 
 */
@Entity
@Table(name="b_dept")
@NamedQuery(name="BDept.findAll", query="SELECT b FROM BDept b")
public class BDept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="ATTR_GROUP_ID")
	private BigInteger attrGroupId;

	@Column(name="ATTR_STATUS")
	private String attrStatus;

	@Column(name="CHECK_TYPE")
	private String checkType;

	@Column(name="content_id")
	private BigInteger contentId;

	@Column(name="CREATE_TIME")
	private String createTime;

	private String description;

	@Column(name="DISPENSE_STATUS")
	private String dispenseStatus;

	private String dn;

	@Column(name="INHERIT_BS")
	private String inheritBs;

	@Column(name="INHERIT_CMS")
	private String inheritCms;

	@Column(name="INHERIT_PORTAL")
	private String inheritPortal;

	@Column(name="MODIFY_TIME")
	private String modifyTime;

	private String name;

	private int pos;

	private String ssoid;

	@Column(name="UNION_CHECK")
	private String unionCheck;

	//bi-directional many-to-one association to AContent
	@OneToMany(mappedBy="BDept")
	private Set<AContent> AContents;

	//bi-directional many-to-one association to AContentB
	@OneToMany(mappedBy="BDept")
	private Set<AContentB> AContentBs;

	//bi-directional many-to-one association to AContentChecking
	@OneToMany(mappedBy="BDept")
	private Set<AContentChecking> AContentCheckings;

	//bi-directional many-to-one association to BContentSubject
	@OneToMany(mappedBy="BDept")
	private Set<BContentSubject> BContentSubjects;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="FATHER_ID")
	private BDept BDept;

	//bi-directional many-to-one association to BDept
	@OneToMany(mappedBy="BDept")
	private Set<BDept> BDepts;

	//bi-directional many-to-one association to BDeptAttr
	@OneToMany(mappedBy="BDept")
	private Set<BDeptAttr> BDeptAttrs;

	//bi-directional many-to-one association to BDeptB
	@OneToMany(mappedBy="BDept1")
	private Set<BDeptB> BDeptBs1;

	//bi-directional many-to-one association to BDeptB
	@OneToMany(mappedBy="BDept2")
	private Set<BDeptB> BDeptBs2;

	//bi-directional many-to-one association to BDeptInputPattern
	@OneToMany(mappedBy="BDept")
	private Set<BDeptInputPattern> BDeptInputPatterns;

	public BDept() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getAttrGroupId() {
		return this.attrGroupId;
	}

	public void setAttrGroupId(BigInteger attrGroupId) {
		this.attrGroupId = attrGroupId;
	}

	public String getAttrStatus() {
		return this.attrStatus;
	}

	public void setAttrStatus(String attrStatus) {
		this.attrStatus = attrStatus;
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public BigInteger getContentId() {
		return this.contentId;
	}

	public void setContentId(BigInteger contentId) {
		this.contentId = contentId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDispenseStatus() {
		return this.dispenseStatus;
	}

	public void setDispenseStatus(String dispenseStatus) {
		this.dispenseStatus = dispenseStatus;
	}

	public String getDn() {
		return this.dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getInheritBs() {
		return this.inheritBs;
	}

	public void setInheritBs(String inheritBs) {
		this.inheritBs = inheritBs;
	}

	public String getInheritCms() {
		return this.inheritCms;
	}

	public void setInheritCms(String inheritCms) {
		this.inheritCms = inheritCms;
	}

	public String getInheritPortal() {
		return this.inheritPortal;
	}

	public void setInheritPortal(String inheritPortal) {
		this.inheritPortal = inheritPortal;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
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

	public String getSsoid() {
		return this.ssoid;
	}

	public void setSsoid(String ssoid) {
		this.ssoid = ssoid;
	}

	public String getUnionCheck() {
		return this.unionCheck;
	}

	public void setUnionCheck(String unionCheck) {
		this.unionCheck = unionCheck;
	}

	public Set<AContent> getAContents() {
		return this.AContents;
	}

	public void setAContents(Set<AContent> AContents) {
		this.AContents = AContents;
	}

	public AContent addAContent(AContent AContent) {
		getAContents().add(AContent);
		AContent.setBDept(this);

		return AContent;
	}

	public AContent removeAContent(AContent AContent) {
		getAContents().remove(AContent);
		AContent.setBDept(null);

		return AContent;
	}

	public Set<AContentB> getAContentBs() {
		return this.AContentBs;
	}

	public void setAContentBs(Set<AContentB> AContentBs) {
		this.AContentBs = AContentBs;
	}

	public AContentB addAContentB(AContentB AContentB) {
		getAContentBs().add(AContentB);
		AContentB.setBDept(this);

		return AContentB;
	}

	public AContentB removeAContentB(AContentB AContentB) {
		getAContentBs().remove(AContentB);
		AContentB.setBDept(null);

		return AContentB;
	}

	public Set<AContentChecking> getAContentCheckings() {
		return this.AContentCheckings;
	}

	public void setAContentCheckings(Set<AContentChecking> AContentCheckings) {
		this.AContentCheckings = AContentCheckings;
	}

	public AContentChecking addAContentChecking(AContentChecking AContentChecking) {
		getAContentCheckings().add(AContentChecking);
		AContentChecking.setBDept(this);

		return AContentChecking;
	}

	public AContentChecking removeAContentChecking(AContentChecking AContentChecking) {
		getAContentCheckings().remove(AContentChecking);
		AContentChecking.setBDept(null);

		return AContentChecking;
	}

	public Set<BContentSubject> getBContentSubjects() {
		return this.BContentSubjects;
	}

	public void setBContentSubjects(Set<BContentSubject> BContentSubjects) {
		this.BContentSubjects = BContentSubjects;
	}

	public BContentSubject addBContentSubject(BContentSubject BContentSubject) {
		getBContentSubjects().add(BContentSubject);
		BContentSubject.setBDept(this);

		return BContentSubject;
	}

	public BContentSubject removeBContentSubject(BContentSubject BContentSubject) {
		getBContentSubjects().remove(BContentSubject);
		BContentSubject.setBDept(null);

		return BContentSubject;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

	public Set<BDept> getBDepts() {
		return this.BDepts;
	}

	public void setBDepts(Set<BDept> BDepts) {
		this.BDepts = BDepts;
	}

	public BDept addBDept(BDept BDept) {
		getBDepts().add(BDept);
		BDept.setBDept(this);

		return BDept;
	}

	public BDept removeBDept(BDept BDept) {
		getBDepts().remove(BDept);
		BDept.setBDept(null);

		return BDept;
	}

	public Set<BDeptAttr> getBDeptAttrs() {
		return this.BDeptAttrs;
	}

	public void setBDeptAttrs(Set<BDeptAttr> BDeptAttrs) {
		this.BDeptAttrs = BDeptAttrs;
	}

	public BDeptAttr addBDeptAttr(BDeptAttr BDeptAttr) {
		getBDeptAttrs().add(BDeptAttr);
		BDeptAttr.setBDept(this);

		return BDeptAttr;
	}

	public BDeptAttr removeBDeptAttr(BDeptAttr BDeptAttr) {
		getBDeptAttrs().remove(BDeptAttr);
		BDeptAttr.setBDept(null);

		return BDeptAttr;
	}

	public Set<BDeptB> getBDeptBs1() {
		return this.BDeptBs1;
	}

	public void setBDeptBs1(Set<BDeptB> BDeptBs1) {
		this.BDeptBs1 = BDeptBs1;
	}

	public BDeptB addBDeptBs1(BDeptB BDeptBs1) {
		getBDeptBs1().add(BDeptBs1);
		BDeptBs1.setBDept1(this);

		return BDeptBs1;
	}

	public BDeptB removeBDeptBs1(BDeptB BDeptBs1) {
		getBDeptBs1().remove(BDeptBs1);
		BDeptBs1.setBDept1(null);

		return BDeptBs1;
	}

	public Set<BDeptB> getBDeptBs2() {
		return this.BDeptBs2;
	}

	public void setBDeptBs2(Set<BDeptB> BDeptBs2) {
		this.BDeptBs2 = BDeptBs2;
	}

	public BDeptB addBDeptBs2(BDeptB BDeptBs2) {
		getBDeptBs2().add(BDeptBs2);
		BDeptBs2.setBDept2(this);

		return BDeptBs2;
	}

	public BDeptB removeBDeptBs2(BDeptB BDeptBs2) {
		getBDeptBs2().remove(BDeptBs2);
		BDeptBs2.setBDept2(null);

		return BDeptBs2;
	}

	public Set<BDeptInputPattern> getBDeptInputPatterns() {
		return this.BDeptInputPatterns;
	}

	public void setBDeptInputPatterns(Set<BDeptInputPattern> BDeptInputPatterns) {
		this.BDeptInputPatterns = BDeptInputPatterns;
	}

	public BDeptInputPattern addBDeptInputPattern(BDeptInputPattern BDeptInputPattern) {
		getBDeptInputPatterns().add(BDeptInputPattern);
		BDeptInputPattern.setBDept(this);

		return BDeptInputPattern;
	}

	public BDeptInputPattern removeBDeptInputPattern(BDeptInputPattern BDeptInputPattern) {
		getBDeptInputPatterns().remove(BDeptInputPattern);
		BDeptInputPattern.setBDept(null);

		return BDeptInputPattern;
	}

}