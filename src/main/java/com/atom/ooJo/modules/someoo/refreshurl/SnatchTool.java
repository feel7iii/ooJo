package com.atom.ooJo.modules.someoo.refreshurl;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.assoft.asopUtil.common.tool.util.TimeUtil;

public class SnatchTool {

//	private static SnatchTool snatchTool;
//
//	public static synchronized SnatchTool getInstance() {
//		if (snatchTool == null) {
//			snatchTool = new SnatchTool();
//		}
//		return snatchTool;
//	}
//	
//	public SnatchTool() {
//	}

	/**
	 * 定时抓取
	 */
	public void timingSnatch(List<String> urls) {

		System.out.println("snatching now ");
		snatchUrls(urls);
		System.out.println("snatching over");
	}

	/**
	 * 从列表中抓取网页
	 * 
	 * @param urls
	 */
	private static void snatchUrls(List<String> urls) {
		if (urls != null) {
			for (String url : urls) {
				snatchUrl(url);
			}
		}

	}

	/**
	 * 从某特定地址中抓取网页
	 * 
	 * @param url
	 */
	@SuppressWarnings("unused")
	private static void snatchUrl(String url) {
		String time = TimeUtil.GetCurDateTime();
		System.out.println("time:" + time + "	snatching From " + url);
		long start = System.currentTimeMillis();
		try {
			Document dom = Jsoup.connect(url).timeout(40 * 1000).get();// 默认40秒
			long end = System.currentTimeMillis();
			long interval = end - start;
			System.out.println("elcipsed:" + interval + "	Result:SUCCESS");
		} catch (Exception e) {
			long end = System.currentTimeMillis();
			long interval = end - start;
			System.out.println("elcipsed:" + interval + "	Result:FAILED");
		}
	}
}
