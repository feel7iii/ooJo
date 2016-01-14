package com.atom.ooJo.configure.etc;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to JHipster.
 *
 * <p>
 * Properties are configured in the application.yml file.
 * </p>
 */
@ConfigurationProperties(prefix = "ooJo", ignoreUnknownFields = false)
public class ooJoProperties {

	private final Pconf pconf = new Pconf();

	public Pconf getPconf() {
		return pconf;
	}

	public static class Pconf {

		private String readFixedRateTime;

		private String reUrl;

		public String getReadFixedRateTime() {
			return readFixedRateTime;
		}

		public void setReadFixedRateTime(String readFixedRateTime) {
			this.readFixedRateTime = readFixedRateTime;
		}

		public String getReUrl() {
			return reUrl;
		}

		public void setReUrl(String reUrl) {
			this.reUrl = reUrl;
		}

	}
}
