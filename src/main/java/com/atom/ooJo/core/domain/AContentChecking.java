package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the a_content_checking database table.
 * 
 */
@Entity
@Table(name="a_content_checking")
@NamedQuery(name="AContentChecking.findAll", query="SELECT a FROM AContentChecking a")
public class AContentChecking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="OPERATOR_NAME")
	private String operatorName;

	@Column(name="PERSON_ID")
	private java.math.BigInteger personId;

	@Column(name="UNION_CHECK")
	private String unionCheck;

	//bi-directional many-to-one association to BDept
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private BDept BDept;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	public AContentChecking() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public java.math.BigInteger getPersonId() {
		return this.personId;
	}

	public void setPersonId(java.math.BigInteger personId) {
		this.personId = personId;
	}

	public String getUnionCheck() {
		return this.unionCheck;
	}

	public void setUnionCheck(String unionCheck) {
		this.unionCheck = unionCheck;
	}

	public BDept getBDept() {
		return this.BDept;
	}

	public void setBDept(BDept BDept) {
		this.BDept = BDept;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

}