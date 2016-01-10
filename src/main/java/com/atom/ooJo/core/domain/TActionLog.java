package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the t_action_log database table.
 * 
 */
@Entity
@Table(name="t_action_log")
@NamedQuery(name="TActionLog.findAll", query="SELECT t FROM TActionLog t")
public class TActionLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="op_des")
	private String opDes;

	@Column(name="op_menu")
	private String opMenu;

	@Column(name="op_name")
	private String opName;

	@Column(name="op_result")
	private String opResult;

	@Column(name="op_time")
	private String opTime;

	@Column(name="op_type")
	private String opType;

	@Column(name="user_dept_dn")
	private String userDeptDn;

	@Column(name="user_dept_name")
	private String userDeptName;

	@Column(name="user_id")
	private BigInteger userId;

	private String user_login_Name;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to TDetailLog
	@OneToMany(mappedBy="TActionLog")
	private Set<TDetailLog> TDetailLogs;

	public TActionLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpDes() {
		return this.opDes;
	}

	public void setOpDes(String opDes) {
		this.opDes = opDes;
	}

	public String getOpMenu() {
		return this.opMenu;
	}

	public void setOpMenu(String opMenu) {
		this.opMenu = opMenu;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpResult() {
		return this.opResult;
	}

	public void setOpResult(String opResult) {
		this.opResult = opResult;
	}

	public String getOpTime() {
		return this.opTime;
	}

	public void setOpTime(String opTime) {
		this.opTime = opTime;
	}

	public String getOpType() {
		return this.opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getUserDeptDn() {
		return this.userDeptDn;
	}

	public void setUserDeptDn(String userDeptDn) {
		this.userDeptDn = userDeptDn;
	}

	public String getUserDeptName() {
		return this.userDeptName;
	}

	public void setUserDeptName(String userDeptName) {
		this.userDeptName = userDeptName;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUser_login_Name() {
		return this.user_login_Name;
	}

	public void setUser_login_Name(String user_login_Name) {
		this.user_login_Name = user_login_Name;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<TDetailLog> getTDetailLogs() {
		return this.TDetailLogs;
	}

	public void setTDetailLogs(Set<TDetailLog> TDetailLogs) {
		this.TDetailLogs = TDetailLogs;
	}

	public TDetailLog addTDetailLog(TDetailLog TDetailLog) {
		getTDetailLogs().add(TDetailLog);
		TDetailLog.setTActionLog(this);

		return TDetailLog;
	}

	public TDetailLog removeTDetailLog(TDetailLog TDetailLog) {
		getTDetailLogs().remove(TDetailLog);
		TDetailLog.setTActionLog(null);

		return TDetailLog;
	}

}