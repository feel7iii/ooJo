package com.atom.ooJo.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.atom.ooJo.common.domain.IdEntity;

@Entity
@Table(name = "CO_PART")
public class UpFile extends IdEntity {

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "SIZE")
	private Long size;

	@Column(name = "WHATSTYPE")
	private String whatstype;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getWhatstype() {
		return whatstype;
	}

	public void setWhatstype(String whatstype) {
		this.whatstype = whatstype;
	}

}
