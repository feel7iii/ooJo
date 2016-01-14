package com.atom.ooJo.configure.bootadmin;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.boot.admin")
public class AdminProperties {

	/**
	 * The admin servers url to register at
	 */
	private String[] url;

	/**
	 * The admin rest-apis path.
	 */
	private String apiPath = "api/applications";

	/**
	 * Time interval (in ms) the registration is repeated
	 */
	private int period = 10000;

	/**
	 * Username for basic authentication on admin server
	 */
	private String username;

	/**
	 * Password for basic authentication on admin server
	 */
	private String password;

	/**
	 * Enable automatic deregistration on shutdown
	 */
	private boolean autoDeregistration;

	public void setUrl(String[] url) {
		this.url = url.clone();
	}

	public String[] getUrl() {
		return url.clone();
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public String getApiPath() {
		return apiPath;
	}

	public String[] getAdminUrl() {
		String adminUrls[] = url.clone();
		for (int i = 0; i < adminUrls.length; i++) {
			adminUrls[i] += "/" + apiPath;
		}
		return adminUrls;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAutoDeregistration() {
		return autoDeregistration;
	}

	public void setAutoDeregistration(boolean autoDeregistration) {
		this.autoDeregistration = autoDeregistration;
	}
}
