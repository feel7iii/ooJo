package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the h_person_subject database table.
 * 
 */
@Entity
@Table(name="h_person_subject")
@NamedQuery(name="HPersonSubject.findAll", query="SELECT h FROM HPersonSubject h")
public class HPersonSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="PERSON_ID")
	private java.math.BigInteger personId;

	private int pos;

	//bi-directional many-to-one association to HSubject
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private HSubject HSubject;

	public HPersonSubject() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public java.math.BigInteger getPersonId() {
		return this.personId;
	}

	public void setPersonId(java.math.BigInteger personId) {
		this.personId = personId;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public HSubject getHSubject() {
		return this.HSubject;
	}

	public void setHSubject(HSubject HSubject) {
		this.HSubject = HSubject;
	}

}