package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_log database table.
 * 
 */
@Entity
@Table(name="t_log")
@NamedQuery(name="TLog.findAll", query="SELECT t FROM TLog t")
public class TLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String description;

	@Column(name="OP_NAME")
	private String opName;

	@Column(name="OP_PARAMETER")
	private String opParameter;

	private String stime;

	private String type;

	@Column(name="USER_NAME")
	private String userName;

	public TLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpParameter() {
		return this.opParameter;
	}

	public void setOpParameter(String opParameter) {
		this.opParameter = opParameter;
	}

	public String getStime() {
		return this.stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}