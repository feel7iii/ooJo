package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the t_detail_log database table.
 * 
 */
@Entity
@Table(name="t_detail_log")
@NamedQuery(name="TDetailLog.findAll", query="SELECT t FROM TDetailLog t")
public class TDetailLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="result_code")
	private String resultCode;

	@Column(name="result_des")
	private String resultDes;

	@Column(name="target_obj_des")
	private String targetObjDes;

	@Column(name="target_obj_id")
	private String targetObjId;

	@Column(name="target_obj_name")
	private String targetObjName;

	@Column(name="target_place_dn")
	private String targetPlaceDn;

	@Column(name="target_place_name")
	private String targetPlaceName;

	//bi-directional many-to-one association to TChangeLog
	@OneToMany(mappedBy="TDetailLog")
	private Set<TChangeLog> TChangeLogs;

	//bi-directional many-to-one association to TActionLog
	@ManyToOne
	@JoinColumn(name="action_log_id")
	private TActionLog TActionLog;

	public TDetailLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDes() {
		return this.resultDes;
	}

	public void setResultDes(String resultDes) {
		this.resultDes = resultDes;
	}

	public String getTargetObjDes() {
		return this.targetObjDes;
	}

	public void setTargetObjDes(String targetObjDes) {
		this.targetObjDes = targetObjDes;
	}

	public String getTargetObjId() {
		return this.targetObjId;
	}

	public void setTargetObjId(String targetObjId) {
		this.targetObjId = targetObjId;
	}

	public String getTargetObjName() {
		return this.targetObjName;
	}

	public void setTargetObjName(String targetObjName) {
		this.targetObjName = targetObjName;
	}

	public String getTargetPlaceDn() {
		return this.targetPlaceDn;
	}

	public void setTargetPlaceDn(String targetPlaceDn) {
		this.targetPlaceDn = targetPlaceDn;
	}

	public String getTargetPlaceName() {
		return this.targetPlaceName;
	}

	public void setTargetPlaceName(String targetPlaceName) {
		this.targetPlaceName = targetPlaceName;
	}

	public Set<TChangeLog> getTChangeLogs() {
		return this.TChangeLogs;
	}

	public void setTChangeLogs(Set<TChangeLog> TChangeLogs) {
		this.TChangeLogs = TChangeLogs;
	}

	public TChangeLog addTChangeLog(TChangeLog TChangeLog) {
		getTChangeLogs().add(TChangeLog);
		TChangeLog.setTDetailLog(this);

		return TChangeLog;
	}

	public TChangeLog removeTChangeLog(TChangeLog TChangeLog) {
		getTChangeLogs().remove(TChangeLog);
		TChangeLog.setTDetailLog(null);

		return TChangeLog;
	}

	public TActionLog getTActionLog() {
		return this.TActionLog;
	}

	public void setTActionLog(TActionLog TActionLog) {
		this.TActionLog = TActionLog;
	}

}