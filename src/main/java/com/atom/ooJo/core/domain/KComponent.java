package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the k_component database table.
 * 
 */
@Entity
@Table(name="k_component")
@NamedQuery(name="KComponent.findAll", query="SELECT k FROM KComponent k")
public class KComponent implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private BigInteger cParamId;
	private byte[] compCparam;
	private String compDefId;
	private byte[] compVparam;
	private BigInteger deptId;
	private String dynamic;
	private String editRefDn;
	private String instanceName;
	private BigInteger personId;
	private String startTime;
	private String status;
	private String subjectDn;
	private BigInteger subjectId;
	private String type;
	private String updateTime;
	private BigInteger versionId;
	private KPattern KPattern;
	private List<KPatternComp> KPatternComps;

	public KComponent() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="C_PARAM_ID")
	public BigInteger getCParamId() {
		return this.cParamId;
	}

	public void setCParamId(BigInteger cParamId) {
		this.cParamId = cParamId;
	}


	@Lob
	@Column(name="COMP_CPARAM")
	public byte[] getCompCparam() {
		return this.compCparam;
	}

	public void setCompCparam(byte[] compCparam) {
		this.compCparam = compCparam;
	}


	@Column(name="COMP_DEF_ID")
	public String getCompDefId() {
		return this.compDefId;
	}

	public void setCompDefId(String compDefId) {
		this.compDefId = compDefId;
	}


	@Lob
	@Column(name="COMP_VPARAM")
	public byte[] getCompVparam() {
		return this.compVparam;
	}

	public void setCompVparam(byte[] compVparam) {
		this.compVparam = compVparam;
	}


	@Column(name="DEPT_ID")
	public BigInteger getDeptId() {
		return this.deptId;
	}

	public void setDeptId(BigInteger deptId) {
		this.deptId = deptId;
	}


	public String getDynamic() {
		return this.dynamic;
	}

	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}


	@Column(name="EDIT_REF_DN")
	public String getEditRefDn() {
		return this.editRefDn;
	}

	public void setEditRefDn(String editRefDn) {
		this.editRefDn = editRefDn;
	}


	@Column(name="INSTANCE_NAME")
	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}


	@Column(name="PERSON_ID")
	public BigInteger getPersonId() {
		return this.personId;
	}

	public void setPersonId(BigInteger personId) {
		this.personId = personId;
	}


	@Column(name="START_TIME")
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


	@Column(name="SUBJECT_DN")
	public String getSubjectDn() {
		return this.subjectDn;
	}

	public void setSubjectDn(String subjectDn) {
		this.subjectDn = subjectDn;
	}


	@Column(name="SUBJECT_ID")
	public BigInteger getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(BigInteger subjectId) {
		this.subjectId = subjectId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Column(name="UPDATE_TIME")
	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}


	@Column(name="version_id")
	public BigInteger getVersionId() {
		return this.versionId;
	}

	public void setVersionId(BigInteger versionId) {
		this.versionId = versionId;
	}


	//bi-directional many-to-one association to KPattern
	@ManyToOne
	@JoinColumn(name="PATTERN_ID")
	public KPattern getKPattern() {
		return this.KPattern;
	}

	public void setKPattern(KPattern KPattern) {
		this.KPattern = KPattern;
	}


	//bi-directional many-to-one association to KPatternComp
	@OneToMany(mappedBy="KComponent")
	public List<KPatternComp> getKPatternComps() {
		return this.KPatternComps;
	}

	public void setKPatternComps(List<KPatternComp> KPatternComps) {
		this.KPatternComps = KPatternComps;
	}

	public KPatternComp addKPatternComp(KPatternComp KPatternComp) {
		getKPatternComps().add(KPatternComp);
		KPatternComp.setKComponent(this);

		return KPatternComp;
	}

	public KPatternComp removeKPatternComp(KPatternComp KPatternComp) {
		getKPatternComps().remove(KPatternComp);
		KPatternComp.setKComponent(null);

		return KPatternComp;
	}

}