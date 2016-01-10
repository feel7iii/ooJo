package com.atom.ooJo.modules.someoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

public class CmsProperties {

	private static Properties properties = new Properties();
	private static final String assoPropertyFileName = "SomeData.properties";
	private static HashMap<String, String> localProperties = null;

	public static void forceLoad() {
		localProperties = null;
		loadLocalPropertyFile();
	}

	public static String getLocalValue(String key) {
		loadLocalPropertyFile();
		return (String) localProperties.get(key);
	}

	private static void loadLocalPropertyFile() {
		if (localProperties != null)
			return;
		try {
			localProperties = new HashMap<String, String>();

			ClassLoader loader = CmsProperties.class.getClassLoader();
			InputStream is = loader.getResourceAsStream(assoPropertyFileName);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bt = new BufferedReader(isr);
			String sss = bt.readLine();

			while (sss != null) {
				sss = sss.trim();
				if ((sss.length() >= 2) && (sss.charAt(0) != '/') && (sss.charAt(1) != '/')) {
					int n = sss.indexOf("=");
					if (n > 0) {
						String n1 = sss.substring(0, n).trim();
						String v1 = sss.substring(n + 1).trim();
						localProperties.put(n1, v1);
					}
				}
				sss = bt.readLine();
			}
			bt.close();
			isr.close();
			is.close();
		} catch (Exception e) {
			System.out.println("读取配置文件SomeData.properties有错误！");
			e.printStackTrace();
			localProperties = null;
		}
	}

	public static boolean loadProperties(InputStream is) {
		try {
			properties.load(is);
		} catch (IOException e) {
			return false;
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static void setProperty(String key, String value, String fileName) {
		try {
			Properties properties = new Properties();

			OutputStream os = FileUtils.openOutputStream(new File(getDirectory(fileName)));
			properties.setProperty(key, value);
			properties.store(os, "UPDATE-ARTIDATE____'" + key + "'____:\n" + value);

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDirectory(String whichBeWriteAndRead) {

		String dir = System.getProperty("user.dir") + File.separator + "ooJo";
		File file = new File(dir);
		String fPaht = file.getPath() + File.separator;
		if ("ArtiData.properties".equals(whichBeWriteAndRead)) {
			fPaht = fPaht + "ArtiData.properties";
		} else if ("PaginationData.properties".equals(whichBeWriteAndRead)) {
			fPaht = fPaht + "PaginationData.properties";
		} else if ("ComponetData.properties".equals(whichBeWriteAndRead)) {
			fPaht = fPaht + "ComponetData.properties";
		}
		return fPaht;
	}
}