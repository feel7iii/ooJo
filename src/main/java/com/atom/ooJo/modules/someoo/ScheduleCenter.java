package com.atom.ooJo.modules.someoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.atom.ooJo.core.domain.AContent;
import com.atom.ooJo.core.domain.KPattern;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheArtiRepository;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheKPatternRepository;

@Configuration
@EnableScheduling
public class ScheduleCenter {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleCenter.class);
	
	@Autowired
	private CacheArtiRepository cacheArtiRepository;
	
	@Autowired
	private CacheKPatternRepository cacheKPatternRepository;
	
	@Autowired
	private ScheduleUtil scheduleUtil;
	
	@Autowired
	private Workshop workshop;
	
	@Value(value = "${readFixedRateTime: no}")
	private String readFixedRateTime;
	
	/**
	 * 用户读取文章表里的OWN_SUBJECT_DN+ID定时写入配置文件ArtiData.properties
	 * 定时每天晚上20点读取
	 */
//	@Scheduled(cron = "0 0 20 * * *")
	@Scheduled(fixedRate = 1000 * 100)
	public void getArtiFromCMS() {
		StringBuilder sbd = new StringBuilder();
		List<AContent> acLst = cacheArtiRepository.findTop10000ByOrderByPublishTimeDesc();
		for (AContent aContent : acLst) {
			if("1".equals(aContent.getType())) {
				sbd.append(aContent.getOwnSubjectDn());
				sbd.append(",");
				sbd.append(aContent.getId());
				sbd.append("|");
			}
		}
		CmsProperties.setProperty("ArtiData", sbd.toString(), "ArtiData.properties");
	}
	
	/**
	 * 用户读取KPattern表里的UBJECT_DN+ID定时写入配置文件ComponetData.properties
	 */
//	@Scheduled(cron = "0 0 22 * * *")
//	@Scheduled(fixedRate = 1000 * 40)
//	public void getAllPattern() {
//		StringBuilder sbd = new StringBuilder();
//		List<KPattern> kpLst = cacheKPatternRepository.findByTypeAndStatus("1", "2");
//		for (KPattern kp : kpLst) {
//			sbd.append(kp.getSubjectDn());
//			sbd.append("|");
//		}
//		CmsProperties.setProperty("ComponetData", sbd.toString(), "ComponetData.properties");
//	}
	
	/**
	 * 用户读取KPattern K_P_COMP 和 KCOMP里内容全集所在DN和总页数 定时写入配置文件PaginationData.properties
	 */
//	@Scheduled(cron = "0 0 24 * * *")
//	@Scheduled(fixedRate = 1000 * 60)
//	public void getAllPaginationsURLAndPageNUM() {
//		String ss = scheduleUtil.getDnAndComIdAndPages();
//		CmsProperties.setProperty("PaginationData", ss, "PaginationData.properties");
//	}
	
	/**
	 * 用于取访问所有文章URL 所需的拼接参数
	 */
	@Scheduled(fixedRate = 1000 * 80)
	public void refreshArtiForRS() {
		InputStream in = null;
		try {
			in = new FileInputStream(new File(CmsProperties.getDirectory("ArtiData.properties")));
		} catch (FileNotFoundException e) {
			logger.error("未找到ArtiData.properties 文件");
			e.printStackTrace();
		}
		CmsProperties.loadProperties(in);
		String artiData = CmsProperties.getProperty("ArtiData");
//		logger.warn("----------"+artiData);
		workshop.refreshArtiForRS(artiData);
	}
	
	
	/**
	 * 用于取访问模版URL 所需的拼接参数
	 */
//	@Scheduled(fixedRate = 1000 * 80)
//	public void refreshPatternForRS() {
//		InputStream in = null;
//		try {
//			in = new FileInputStream(new File(CmsProperties.getDirectory("ComponetData.properties")));
//		} catch (FileNotFoundException e) {
//			logger.error("未找到ComponetData.properties 文件");
//			e.printStackTrace();
//		}
//		CmsProperties.loadProperties(in);
//		String componetData = CmsProperties.getProperty("ComponetData");
////		logger.info("==========" + componetData);
//		workshop.refreshPatternForRS(componetData);
//	}
	
	/**
	 * 用于取访问所有内容全集分页URL 所需的拼接参数
	 */
//	@Scheduled(fixedRate = 1000 * 80)
//	public void refreshPaginationForRS() {
//		InputStream in = null;
//		try {
//			in = new FileInputStream(new File(CmsProperties.getDirectory("PaginationData.properties")));
//		} catch (FileNotFoundException e) {
//			logger.error("未找到PaginationData.properties 文件");
//			e.printStackTrace();
//		}
//		CmsProperties.loadProperties(in);
//		String paginationData = CmsProperties.getProperty("PaginationData");
////		logger.info("**********"+paginationData);
//		workshop.refreshPaginationForRS(paginationData);
//	}
	
}