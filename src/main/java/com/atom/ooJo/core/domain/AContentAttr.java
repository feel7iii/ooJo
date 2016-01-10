package com.atom.ooJo.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the a_content_attr database table.
 * 
 */
@Entity
@Table(name="a_content_attr")
@NamedQuery(name="AContentAttr.findAll", query="SELECT a FROM AContentAttr a")
public class AContentAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String code;

	@Column(name="DATA_TYPE")
	private String dataType;

	@Column(name="DATTR_ID")
	private BigInteger dattrId;

	@Column(name="default_value")
	private String defaultValue;

	@Column(name="FULL_DEF_NAME")
	private String fullDefName;

	private int high;

	@Column(name="META_ID")
	private BigInteger metaId;

	@Column(name="MUST_INPUT")
	private String mustInput;

	private String name;

	private int pos;

	@Column(name="SHORT_NAME")
	private String shortName;

	private String value;

	private int width;

	//bi-directional many-to-one association to AContentAttrList
	@ManyToOne
	@JoinColumn(name="LIST_ID")
	private AContentAttrList AContentAttrList;

	//bi-directional many-to-one association to AContent
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private AContent AContent;

	//bi-directional many-to-one association to AContentAttrList
	@OneToMany(mappedBy="AContentAttr")
	private Set<AContentAttrList> AContentAttrLists;

	//bi-directional one-to-one association to AContentAttrPart
	@OneToOne(mappedBy="AContentAttr")
	private AContentAttrPart AContentAttrPart;

	public AContentAttr() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public BigInteger getDattrId() {
		return this.dattrId;
	}

	public void setDattrId(BigInteger dattrId) {
		this.dattrId = dattrId;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getFullDefName() {
		return this.fullDefName;
	}

	public void setFullDefName(String fullDefName) {
		this.fullDefName = fullDefName;
	}

	public int getHigh() {
		return this.high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public BigInteger getMetaId() {
		return this.metaId;
	}

	public void setMetaId(BigInteger metaId) {
		this.metaId = metaId;
	}

	public String getMustInput() {
		return this.mustInput;
	}

	public void setMustInput(String mustInput) {
		this.mustInput = mustInput;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public AContentAttrList getAContentAttrList() {
		return this.AContentAttrList;
	}

	public void setAContentAttrList(AContentAttrList AContentAttrList) {
		this.AContentAttrList = AContentAttrList;
	}

	public AContent getAContent() {
		return this.AContent;
	}

	public void setAContent(AContent AContent) {
		this.AContent = AContent;
	}

	public Set<AContentAttrList> getAContentAttrLists() {
		return this.AContentAttrLists;
	}

	public void setAContentAttrLists(Set<AContentAttrList> AContentAttrLists) {
		this.AContentAttrLists = AContentAttrLists;
	}

	public AContentAttrList addAContentAttrList(AContentAttrList AContentAttrList) {
		getAContentAttrLists().add(AContentAttrList);
		AContentAttrList.setAContentAttr(this);

		return AContentAttrList;
	}

	public AContentAttrList removeAContentAttrList(AContentAttrList AContentAttrList) {
		getAContentAttrLists().remove(AContentAttrList);
		AContentAttrList.setAContentAttr(null);

		return AContentAttrList;
	}

	public AContentAttrPart getAContentAttrPart() {
		return this.AContentAttrPart;
	}

	public void setAContentAttrPart(AContentAttrPart AContentAttrPart) {
		this.AContentAttrPart = AContentAttrPart;
	}

}