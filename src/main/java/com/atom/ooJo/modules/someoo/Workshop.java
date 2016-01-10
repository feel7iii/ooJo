package com.atom.ooJo.modules.someoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.atom.ooJo.modules.someoo.refreshurl.MultiPageConfig;
import com.atom.ooJo.modules.someoo.refreshurl.ResourceUrlsTool;
import com.atom.ooJo.modules.someoo.refreshurl.SnatchTool;

@Component
public class Workshop {
	
	@Value(value = "${reUrl: http://86.0.17.197/serviceweb}")
	private String reUrl;

	public void refreshArtiForRS(final String artiData) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() { //new个线程,并发执行,相当于一次三个请求

			@Override
			public void run() {
				// TODO Auto-generated method stub
				String[] eachRefreshObj = artiData.split("\\|");
				for (int i = 0; i < eachRefreshObj.length; i++) {
					String[] eachRefreshComp = eachRefreshObj[i].split(",");
					MultiPageConfig multiPageConfig = buildConfig4Arti(eachRefreshComp[0], eachRefreshComp[1]);
					List<String> urls = ResourceUrlsTool.buildSnatchUrls4Arti(multiPageConfig, eachRefreshObj.length);
					SnatchTool st = new SnatchTool();
					st.timingSnatch(urls);
				}
			}
			
		}).start();
	}

	private MultiPageConfig buildConfig4Arti(String dn, String contentId) {
		MultiPageConfig config = new MultiPageConfig();
		config.setPrefix(reUrl);
		config.setDn(dn);
		config.setContentId(contentId);
		return config;
	}

	public void refreshPatternForRS(final String componetData) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				String[] eachRefreshObj = componetData.split("\\|");
				for (int i = 0; i < eachRefreshObj.length; i++) {
					MultiPageConfig multiPageConfig = buildConfig4Pattern(eachRefreshObj[i]);
					List<String> urls = ResourceUrlsTool.buildSnatch4Pattern(multiPageConfig);
					SnatchTool st = new SnatchTool();
					st.timingSnatch(urls);
				}
			}
			
		}).start();
		
	}
	
	private static MultiPageConfig buildConfig4Pattern(String dn) {
		MultiPageConfig config = new MultiPageConfig();
		config.setPrefix("http://86.0.17.197/serviceweb");
		config.setDn(dn);
		return config;
	}
	
	public void refreshPaginationForRS(final String paginationData) {

		new Thread(new Runnable(){
			@Override
			public void run() {
				String[] eachRefreshObj = paginationData.split("\\|");
				for (int i = 0; i < eachRefreshObj.length; i++) {
					String[] eachRefreshComp = eachRefreshObj[i].split(",");
					MultiPageConfig multiPageConfig = buildConfig4Page(eachRefreshComp[0], eachRefreshComp[1], eachRefreshComp[2]);
					List<String> urls = ResourceUrlsTool.buildSnatchUrls(multiPageConfig);
					SnatchTool st = new SnatchTool();
					st.timingSnatch(urls);
				}
				
			}
		}).start();
	}
	
	private static MultiPageConfig buildConfig4Page(String dn, String comId, String pageNum) {
		MultiPageConfig config = new MultiPageConfig();
		config.setPrefix("http://86.0.17.197/serviceweb");
		config.setDn(dn);
		config.setCompId(comId);
		config.setStartIndex(Integer.parseInt(pageNum));
		return config;
	}

}
