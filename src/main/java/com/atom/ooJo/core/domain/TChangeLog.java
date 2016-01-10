package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_change_log database table.
 * 
 */
@Entity
@Table(name="t_change_log")
@NamedQuery(name="TChangeLog.findAll", query="SELECT t FROM TChangeLog t")
public class TChangeLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="change_des")
	private String changeDes;

	@Lob
	@Column(name="target_before")
	private String targetBefore;

	@Lob
	@Column(name="target_now")
	private String targetNow;

	//bi-directional many-to-one association to TDetailLog
	@ManyToOne
	@JoinColumn(name="detail_log_id")
	private TDetailLog TDetailLog;

	public TChangeLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChangeDes() {
		return this.changeDes;
	}

	public void setChangeDes(String changeDes) {
		this.changeDes = changeDes;
	}

	public String getTargetBefore() {
		return this.targetBefore;
	}

	public void setTargetBefore(String targetBefore) {
		this.targetBefore = targetBefore;
	}

	public String getTargetNow() {
		return this.targetNow;
	}

	public void setTargetNow(String targetNow) {
		this.targetNow = targetNow;
	}

	public TDetailLog getTDetailLog() {
		return this.TDetailLog;
	}

	public void setTDetailLog(TDetailLog TDetailLog) {
		this.TDetailLog = TDetailLog;
	}

}