package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the k_pattern_comp database table.
 * 
 */
@Entity
@Table(name="k_pattern_comp")
@NamedQuery(name="KPatternComp.findAll", query="SELECT k FROM KPatternComp k")
public class KPatternComp implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String markName;
	private int markPos;
	private BigInteger userId;
	private KPattern KPattern;
	private KComponent KComponent;

	public KPatternComp() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="MARK_NAME")
	public String getMarkName() {
		return this.markName;
	}

	public void setMarkName(String markName) {
		this.markName = markName;
	}


	@Column(name="MARK_POS")
	public int getMarkPos() {
		return this.markPos;
	}

	public void setMarkPos(int markPos) {
		this.markPos = markPos;
	}


	@Column(name="USER_ID")
	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
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


	//bi-directional many-to-one association to KComponent
	@ManyToOne
	@JoinColumn(name="COMP_ID")
	public KComponent getKComponent() {
		return this.KComponent;
	}

	public void setKComponent(KComponent KComponent) {
		this.KComponent = KComponent;
	}

}