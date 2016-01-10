package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

/**
 * The persistent class for the a_content database table.
 * 
 */
@Entity
@Table(name = "a_content")
@NamedQuery(name = "AContent.findAll", query = "SELECT a FROM AContent a")
public class AContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "APP_ID")
	private String appId;

	@Column(name = "APP_NAME")
	private String appName;

	private String author;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	private String description;

	private String dn;

	@Column(name = "EX_TYPE")
	private String exType;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "GROUP_MARK")
	private String groupMark;

	@Column(name = "HAVE_TITLE_PIC")
	private String haveTitlePic;

	@Column(name = "MODIFY_TIME")
	private String modifyTime;

	@Column(name = "ORDER_TIME")
	private String orderTime;

	@Column(name = "OWN_SUBJECT_DN")
	private String ownSubjectDn;

	@Column(name = "PUBLISH_TIME")
	private String publishTime;

	@Column(name = "recycle_status")
	private String recycleStatus;

	@Column(name = "SC_DN")
	private String scDn;

	@Column(name = "SC_FULL_NAME")
	private String scFullName;

	@Column(name = "SC_ID")
	private BigInteger scId;

	@Column(name = "SECURITY_LEVEL")
	private String securityLevel;

	@Column(name = "START_TIME")
	private String startTime;

	private String status;

	private String title;

	private String type;

	@Column(name = "URGENCY_MARK")
	private String urgencyMark;

	// bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name = "DEPT_ID")
	private BDept BDept;

	// bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name = "OWN_SUBJECT_ID")
	private HSubject HSubject1;

	// bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name = "REF_SUB_ID")
	private HSubject HSubject2;

	// bi-directional many-to-one association to AContentAttr
	@OneToMany(mappedBy = "AContent")
	private Set<AContentAttr> AContentAttrs;

	// bi-directional many-to-one association to AContentB
	@OneToMany(mappedBy = "AContent")
	private Set<AContentB> AContentBs;

	// bi-directional many-to-one association to AContentCheck
	@OneToMany(mappedBy = "AContent")
	private Set<AContentCheck> AContentChecks;

	// bi-directional many-to-one association to AContentChecking
	@OneToMany(mappedBy = "AContent")
	private Set<AContentChecking> AContentCheckings;

	// bi-directional many-to-one association to AContentPart
	@OneToMany(mappedBy = "AContent")
	private Set<AContentPart> AContentParts;

	// bi-directional many-to-one association to AContentPub
	@OneToMany(mappedBy = "AContent")
	private Set<AContentPub> AContentPubs;

	// bi-directional many-to-one association to AContentRelated
	@OneToMany(mappedBy = "AContent1")
	private Set<AContentRelated> AContentRelateds1;

	// bi-directional many-to-one association to AContentRelated
	@OneToMany(mappedBy = "AContent2")
	private Set<AContentRelated> AContentRelateds2;

	// bi-directional one-to-one association to AContentText
	@OneToOne(mappedBy = "AContent")
	private AContentText AContentText;

	// bi-directional many-to-one association to BContentSubject
	@OneToMany(mappedBy = "AContent")
	private Set<BContentSubject> BContentSubjects;

	// bi-directional many-to-one association to HContentCheck
	@OneToMany(mappedBy = "AContent")
	private Set<HContentCheck> HContentChecks;

	// bi-directional many-to-one association to HContentChecking
	@OneToMany(mappedBy = "AContent")
	private Set<HContentChecking> HContentCheckings;

	// bi-directional many-to-one association to HContentSubject
	@OneToMany(mappedBy = "AContent")
	private Set<HContentSubject> HContentSubjects;

	// bi-directional many-to-one association to HContentTj
	@OneToMany(mappedBy = "AContent")
	private Set<HContentTj> HContentTjs;

	// bi-directional many-to-one association to HSubjectB
	@OneToMany(mappedBy = "AContent")
	private Set<HSubjectB> HSubjectBs;

	public AContent() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDn() {
		return this.dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getExType() {
		return this.exType;
	}

	public void setExType(String exType) {
		this.exType = exType;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGroupMark() {
		return this.groupMark;
	}

	public void setGroupMark(String groupMark) {
		this.groupMark = groupMark;
	}

	public String getHaveTitlePic() {
		return this.haveTitlePic;
	}

	public void setHaveTitlePic(String haveTitlePic) {
		this.haveTitlePic = haveTitlePic;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOwnSubjectDn() {
		return this.ownSubjectDn;
	}

	public void setOwnSubjectDn(String ownSubjectDn) {
		this.ownSubjectDn = ownSubjectDn;
	}

	public String getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getRecycleStatus() {
		return this.recycleStatus;
	}

	public void setRecycleStatus(String recycleStatus) {
		this.recycleStatus = recycleStatus;
	}

	public String getScDn() {
		return this.scDn;
	}

	public void setScDn(String scDn) {
		this.scDn = scDn;
	}

	public String getScFullName() {
		return this.scFullName;
	}

	public void setScFullName(String scFullName) {
		this.scFullName = scFullName;
	}

	public BigInteger getScId() {
		return this.scId;
	}

	public void setScId(BigInteger scId) {
		this.scId = scId;
	}

	public String getSecurityLevel() {
		return this.securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrgencyMark() {
		return this.urgencyMark;
	}

	public void setUrgencyMark(String urgencyMark) {
		this.urgencyMark = urgencyMark;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

	public HSubject getHSubject1() {
		return this.HSubject1;
	}

	public void setHSubject1(HSubject HSubject1) {
		this.HSubject1 = HSubject1;
	}

	public HSubject getHSubject2() {
		return this.HSubject2;
	}

	public void setHSubject2(HSubject HSubject2) {
		this.HSubject2 = HSubject2;
	}

	public Set<AContentAttr> getAContentAttrs() {
		return this.AContentAttrs;
	}

	public void setAContentAttrs(Set<AContentAttr> AContentAttrs) {
		this.AContentAttrs = AContentAttrs;
	}

	public AContentAttr addAContentAttr(AContentAttr AContentAttr) {
		getAContentAttrs().add(AContentAttr);
		AContentAttr.setAContent(this);

		return AContentAttr;
	}

	public AContentAttr removeAContentAttr(AContentAttr AContentAttr) {
		getAContentAttrs().remove(AContentAttr);
		AContentAttr.setAContent(null);

		return AContentAttr;
	}

	public Set<AContentB> getAContentBs() {
		return this.AContentBs;
	}

	public void setAContentBs(Set<AContentB> AContentBs) {
		this.AContentBs = AContentBs;
	}

	public AContentB addAContentB(AContentB AContentB) {
		getAContentBs().add(AContentB);
		AContentB.setAContent(this);

		return AContentB;
	}

	public AContentB removeAContentB(AContentB AContentB) {
		getAContentBs().remove(AContentB);
		AContentB.setAContent(null);

		return AContentB;
	}

	public Set<AContentCheck> getAContentChecks() {
		return this.AContentChecks;
	}

	public void setAContentChecks(Set<AContentCheck> AContentChecks) {
		this.AContentChecks = AContentChecks;
	}

	public AContentCheck addAContentCheck(AContentCheck AContentCheck) {
		getAContentChecks().add(AContentCheck);
		AContentCheck.setAContent(this);

		return AContentCheck;
	}

	public AContentCheck removeAContentCheck(AContentCheck AContentCheck) {
		getAContentChecks().remove(AContentCheck);
		AContentCheck.setAContent(null);

		return AContentCheck;
	}

	public Set<AContentChecking> getAContentCheckings() {
		return this.AContentCheckings;
	}

	public void setAContentCheckings(Set<AContentChecking> AContentCheckings) {
		this.AContentCheckings = AContentCheckings;
	}

	public AContentChecking addAContentChecking(AContentChecking AContentChecking) {
		getAContentCheckings().add(AContentChecking);
		AContentChecking.setAContent(this);

		return AContentChecking;
	}

	public AContentChecking removeAContentChecking(AContentChecking AContentChecking) {
		getAContentCheckings().remove(AContentChecking);
		AContentChecking.setAContent(null);

		return AContentChecking;
	}

	public Set<AContentPart> getAContentParts() {
		return this.AContentParts;
	}

	public void setAContentParts(Set<AContentPart> AContentParts) {
		this.AContentParts = AContentParts;
	}

	public AContentPart addAContentPart(AContentPart AContentPart) {
		getAContentParts().add(AContentPart);
		AContentPart.setAContent(this);

		return AContentPart;
	}

	public AContentPart removeAContentPart(AContentPart AContentPart) {
		getAContentParts().remove(AContentPart);
		AContentPart.setAContent(null);

		return AContentPart;
	}

	public Set<AContentPub> getAContentPubs() {
		return this.AContentPubs;
	}

	public void setAContentPubs(Set<AContentPub> AContentPubs) {
		this.AContentPubs = AContentPubs;
	}

	public AContentPub addAContentPub(AContentPub AContentPub) {
		getAContentPubs().add(AContentPub);
		AContentPub.setAContent(this);

		return AContentPub;
	}

	public AContentPub removeAContentPub(AContentPub AContentPub) {
		getAContentPubs().remove(AContentPub);
		AContentPub.setAContent(null);

		return AContentPub;
	}

	public Set<AContentRelated> getAContentRelateds1() {
		return this.AContentRelateds1;
	}

	public void setAContentRelateds1(Set<AContentRelated> AContentRelateds1) {
		this.AContentRelateds1 = AContentRelateds1;
	}

	public AContentRelated addAContentRelateds1(AContentRelated AContentRelateds1) {
		getAContentRelateds1().add(AContentRelateds1);
		AContentRelateds1.setAContent1(this);

		return AContentRelateds1;
	}

	public AContentRelated removeAContentRelateds1(AContentRelated AContentRelateds1) {
		getAContentRelateds1().remove(AContentRelateds1);
		AContentRelateds1.setAContent1(null);

		return AContentRelateds1;
	}

	public Set<AContentRelated> getAContentRelateds2() {
		return this.AContentRelateds2;
	}

	public void setAContentRelateds2(Set<AContentRelated> AContentRelateds2) {
		this.AContentRelateds2 = AContentRelateds2;
	}

	public AContentRelated addAContentRelateds2(AContentRelated AContentRelateds2) {
		getAContentRelateds2().add(AContentRelateds2);
		AContentRelateds2.setAContent2(this);

		return AContentRelateds2;
	}

	public AContentRelated removeAContentRelateds2(AContentRelated AContentRelateds2) {
		getAContentRelateds2().remove(AContentRelateds2);
		AContentRelateds2.setAContent2(null);

		return AContentRelateds2;
	}

	public AContentText getAContentText() {
		return this.AContentText;
	}

	public void setAContentText(AContentText AContentText) {
		this.AContentText = AContentText;
	}

	public Set<BContentSubject> getBContentSubjects() {
		return this.BContentSubjects;
	}

	public void setBContentSubjects(Set<BContentSubject> BContentSubjects) {
		this.BContentSubjects = BContentSubjects;
	}

	public BContentSubject addBContentSubject(BContentSubject BContentSubject) {
		getBContentSubjects().add(BContentSubject);
		BContentSubject.setAContent(this);

		return BContentSubject;
	}

	public BContentSubject removeBContentSubject(BContentSubject BContentSubject) {
		getBContentSubjects().remove(BContentSubject);
		BContentSubject.setAContent(null);

		return BContentSubject;
	}

	public Set<HContentCheck> getHContentChecks() {
		return this.HContentChecks;
	}

	public void setHContentChecks(Set<HContentCheck> HContentChecks) {
		this.HContentChecks = HContentChecks;
	}

	public HContentCheck addHContentCheck(HContentCheck HContentCheck) {
		getHContentChecks().add(HContentCheck);
		HContentCheck.setAContent(this);

		return HContentCheck;
	}

	public HContentCheck removeHContentCheck(HContentCheck HContentCheck) {
		getHContentChecks().remove(HContentCheck);
		HContentCheck.setAContent(null);

		return HContentCheck;
	}

	public Set<HContentChecking> getHContentCheckings() {
		return this.HContentCheckings;
	}

	public void setHContentCheckings(Set<HContentChecking> HContentCheckings) {
		this.HContentCheckings = HContentCheckings;
	}

	public HContentChecking addHContentChecking(HContentChecking HContentChecking) {
		getHContentCheckings().add(HContentChecking);
		HContentChecking.setAContent(this);

		return HContentChecking;
	}

	public HContentChecking removeHContentChecking(HContentChecking HContentChecking) {
		getHContentCheckings().remove(HContentChecking);
		HContentChecking.setAContent(null);

		return HContentChecking;
	}

	public Set<HContentSubject> getHContentSubjects() {
		return this.HContentSubjects;
	}

	public void setHContentSubjects(Set<HContentSubject> HContentSubjects) {
		this.HContentSubjects = HContentSubjects;
	}

	public HContentSubject addHContentSubject(HContentSubject HContentSubject) {
		getHContentSubjects().add(HContentSubject);
		HContentSubject.setAContent(this);

		return HContentSubject;
	}

	public HContentSubject removeHContentSubject(HContentSubject HContentSubject) {
		getHContentSubjects().remove(HContentSubject);
		HContentSubject.setAContent(null);

		return HContentSubject;
	}

	public Set<HContentTj> getHContentTjs() {
		return this.HContentTjs;
	}

	public void setHContentTjs(Set<HContentTj> HContentTjs) {
		this.HContentTjs = HContentTjs;
	}

	public HContentTj addHContentTj(HContentTj HContentTj) {
		getHContentTjs().add(HContentTj);
		HContentTj.setAContent(this);

		return HContentTj;
	}

	public HContentTj removeHContentTj(HContentTj HContentTj) {
		getHContentTjs().remove(HContentTj);
		HContentTj.setAContent(null);

		return HContentTj;
	}

	public Set<HSubjectB> getHSubjectBs() {
		return this.HSubjectBs;
	}

	public void setHSubjectBs(Set<HSubjectB> HSubjectBs) {
		this.HSubjectBs = HSubjectBs;
	}

	public HSubjectB addHSubjectB(HSubjectB HSubjectB) {
		getHSubjectBs().add(HSubjectB);
		HSubjectB.setAContent(this);

		return HSubjectB;
	}

	public HSubjectB removeHSubjectB(HSubjectB HSubjectB) {
		getHSubjectBs().remove(HSubjectB);
		HSubjectB.setAContent(null);

		return HSubjectB;
	}

}