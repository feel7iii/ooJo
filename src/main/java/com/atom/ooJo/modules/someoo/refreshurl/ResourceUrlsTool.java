package com.atom.ooJo.modules.someoo.refreshurl;

import java.util.ArrayList;
import java.util.List;

public class ResourceUrlsTool {

	/**
	 * http://ip:port/serviceweb/piecesDN(dn)/securityLevel_index_compId_pages.html
	 * @param comp
	 * @return
	 */
	public static List<String> buildSnatchUrls(MultiPageConfig comp) {
		List<String> urls = new ArrayList<String>();
		int startIndex = comp.getStartIndex();
		String dn = piecesDn(comp.getDn());
		String prefix = comp.getPrefix();
		String securityLevel = "" + comp.getSecuritlyLevel();
		String compId = comp.getCompId();
		urls.add(prefix);

		// 预加载前20
		int preIndex = 0;
		int pageNum = 50;
		if (startIndex > pageNum * 2) {
			for (int i = startIndex; i >= 0; i--) {
				String url = prefix + dn + "/" + securityLevel + "_index_" + compId + "_" + i + ".html";
				if (preIndex >= 50) {
					break;
				}
				urls.add(url);
				preIndex++;
			}
			// 预加载后20
			for (int i = 0; i < 50; i++) {
				String url = prefix + dn + "/" + securityLevel + "_index_" + compId + "_" + i + ".html";
				urls.add(url);
			}
		} else { //刷新这100以内的所有URL
			for (int i = 0; i < startIndex; i++) {
				String url = prefix + dn + "/" + securityLevel + "_index_" + compId + "_" + i + ".html";
				urls.add(url);
			}
		}
		return urls;
	}

	public static List<String> buildSnatchUrls4Arti(MultiPageConfig multiPageConfig, int acCount) {
		List<String> urls = new ArrayList<String>();
		String dn = piecesDn(multiPageConfig.getDn());
		String prefix = multiPageConfig.getPrefix();
		String securityLevel = "" + multiPageConfig.getSecuritlyLevel();
		String contentId = multiPageConfig.getContentId();
		String url = prefix + dn + "/c" + contentId + "/" + securityLevel + "_content" + ".html";
		urls.add(url);
		return urls;
	}
	
	public static List<String> buildSnatch4Pattern(MultiPageConfig multiPageConfig) {
		List<String> urls = new ArrayList<String>();
		String dn = piecesDn(multiPageConfig.getDn());
		String prefix = multiPageConfig.getPrefix();
		String securityLevel = "" + multiPageConfig.getSecuritlyLevel();
		String url = prefix + dn + "/" + securityLevel + "_index" + ".html";
		urls.add(url);
		return urls;
	}
	
	public static String piecesDn(String dn) {

		String completeDn = "";

		String[] completeDns = dn.split("/");
		for (int i = 3; i < completeDns.length; i++) {
			if (completeDns[i].equals("") == false) {
				completeDn += "/n" + completeDns[i];
			}
		}
		return completeDn;
	}

}
