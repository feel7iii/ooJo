package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the k_pattern database table.
 * 
 */
@Entity
@Table(name="k_pattern")
@NamedQuery(name="KPattern.findAll", query="SELECT k FROM KPattern k")
public class KPattern implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String author;
	private BigInteger deptId;
	private String description;
	private BigInteger frameId;
	private String inheritName;
	private String name;
	private BigInteger personId;
	private String startTime;
	private String status;
	private String subjectDn;
	private BigInteger subjectId;
	private String type;
	private String updateTime;
	private BigInteger versionId;
	private List<KComponent> KComponents;
	private List<KPatternComp> KPatternComps;

	public KPattern() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	@Column(name="DEPT_ID")
	public BigInteger getDeptId() {
		return this.deptId;
	}

	public void setDeptId(BigInteger deptId) {
		this.deptId = deptId;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name="FRAME_ID")
	public BigInteger getFrameId() {
		return this.frameId;
	}

	public void setFrameId(BigInteger frameId) {
		this.frameId = frameId;
	}


	@Column(name="INHERIT_NAME")
	public String getInheritName() {
		return this.inheritName;
	}

	public void setInheritName(String inheritName) {
		this.inheritName = inheritName;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	//bi-directional many-to-one association to KComponent
	@OneToMany(mappedBy="KPattern")
	public List<KComponent> getKComponents() {
		return this.KComponents;
	}

	public void setKComponents(List<KComponent> KComponents) {
		this.KComponents = KComponents;
	}

	public KComponent addKComponent(KComponent KComponent) {
		getKComponents().add(KComponent);
		KComponent.setKPattern(this);

		return KComponent;
	}

	public KComponent removeKComponent(KComponent KComponent) {
		getKComponents().remove(KComponent);
		KComponent.setKPattern(null);

		return KComponent;
	}


	//bi-directional many-to-one association to KPatternComp
	@OneToMany(mappedBy="KPattern")
	public List<KPatternComp> getKPatternComps() {
		return this.KPatternComps;
	}

	public void setKPatternComps(List<KPatternComp> KPatternComps) {
		this.KPatternComps = KPatternComps;
	}

	public KPatternComp addKPatternComp(KPatternComp KPatternComp) {
		getKPatternComps().add(KPatternComp);
		KPatternComp.setKPattern(this);

		return KPatternComp;
	}

	public KPatternComp removeKPatternComp(KPatternComp KPatternComp) {
		getKPatternComps().remove(KPatternComp);
		KPatternComp.setKPattern(null);

		return KPatternComp;
	}

}