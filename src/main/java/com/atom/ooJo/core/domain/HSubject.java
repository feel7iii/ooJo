package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the h_subjects database table.
 * 
 */
@Entity
@Table(name="h_subject")
@NamedQuery(name="HSubject.findAll", query="SELECT h FROM HSubject h")
public class HSubject implements Serializable {
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

	@Column(name="CREATE_TIME")
	private String createTime;

	private String description;

	private String dn;

	@Column(name="DOMAIN_NAME")
	private String domainName;

	@Column(name="FLOW_GROUP_ID")
	private BigInteger flowGroupId;

	@Column(name="FLOW_STATUS")
	private String flowStatus;

	@Column(name="GROUP_MARK")
	private String groupMark;

	@Column(name="MODIFY_TIME")
	private String modifyTime;

	private String name;

	private int pos;

	@Column(name="SECURITY_LEVEL")
	private String securityLevel;

	private String status;

	@Column(name="TJ_STATUS")
	private String tjStatus;

	@Column(name="TOP_LEVEL")
	private BigInteger topLevel;

	private String type;

	@Column(name="UNION_CHECK")
	private String unionCheck;

	@Column(name="UNIQUE_NAME")
	private String uniqueName;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="FATHER_ID")
	private HSubject HSubject;

	public HSubject() {
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

	public String getDn() {
		return this.dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public BigInteger getFlowGroupId() {
		return this.flowGroupId;
	}

	public void setFlowGroupId(BigInteger flowGroupId) {
		this.flowGroupId = flowGroupId;
	}

	public String getFlowStatus() {
		return this.flowStatus;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	public String getGroupMark() {
		return this.groupMark;
	}

	public void setGroupMark(String groupMark) {
		this.groupMark = groupMark;
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

	public String getSecurityLevel() {
		return this.securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTjStatus() {
		return this.tjStatus;
	}

	public void setTjStatus(String tjStatus) {
		this.tjStatus = tjStatus;
	}

	public BigInteger getTopLevel() {
		return this.topLevel;
	}

	public void setTopLevel(BigInteger topLevel) {
		this.topLevel = topLevel;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnionCheck() {
		return this.unionCheck;
	}

	public void setUnionCheck(String unionCheck) {
		this.unionCheck = unionCheck;
	}

	public String getUniqueName() {
		return this.uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}