package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_cms_log database table.
 * 
 */
@Entity
@Table(name="t_cms_log")
@NamedQuery(name="TCmsLog.findAll", query="SELECT t FROM TCmsLog t")
public class TCmsLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="CREATE_TIME")
	private String createTime;

	@Column(name="OP_NAME")
	private String opName;

	@Column(name="OP_TARGET_DES")
	private String opTargetDes;

	@Column(name="RESULT_TYPE")
	private String resultType;

	private String type;

	@Column(name="USER_ID")
	private BigInteger userId;

	@Column(name="USER_NAME")
	private String userName;

	public TCmsLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpTargetDes() {
		return this.opTargetDes;
	}

	public void setOpTargetDes(String opTargetDes) {
		this.opTargetDes = opTargetDes;
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}