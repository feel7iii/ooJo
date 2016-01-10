package com.atom.ooJo.modules.someoo.refreshurl;

import java.io.Serializable;

public class MultiPageConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private String prefix;
	private String dn;
	private int securitlyLevel;
	private String compId;
	private int startIndex;
	private String contentId;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public int getSecuritlyLevel() {
		return securitlyLevel;
	}

	public void setSecuritlyLevel(int securitlyLevel) {
		this.securitlyLevel = securitlyLevel;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
