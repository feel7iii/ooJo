package com.atom.ooJo.modules.someoo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atom.ooJo.core.domain.KComponent;
import com.atom.ooJo.core.domain.KPattern;
import com.atom.ooJo.core.domain.KPatternComp;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheHContentSubjectRepository;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheKComponentRepository;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheKPatternCompRepository;
import com.atom.ooJo.modules.someoo.cmscacheRepository.CacheKPatternRepository;

@Component
public class ScheduleUtil {

	@Autowired
	private CacheKComponentRepository cacheKComponentRepository;

	@Autowired
	private CacheHContentSubjectRepository acheHContentSubjectRepository;

	@Autowired
	private CacheKPatternCompRepository cacheKPatternCompRepository;

	@Autowired
	private CacheKPatternRepository cacheKPatternRepository;

	public String getDnAndComIdAndPages() {
		StringBuilder sbd = new StringBuilder();
		Map<String, String> map = getAllContentsCompIds();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			KPattern kp = cacheKPatternRepository.findById(entry.getValue());
			if (loadCompNum(kp.getSubjectDn()) > 0) {
				sbd.append(kp.getSubjectDn());
				sbd.append(",");
				sbd.append(entry.getKey());
				sbd.append(",");
				sbd.append(loadCompNum(kp.getSubjectDn()));
				sbd.append("|");
			}
		}
		return sbd.toString();
	}

	/**
	 * 取得COMP_ID+PATTERN_ID封装在一个MAP对象里
	 * 
	 * @return
	 */
	public Map<String, String> getAllContentsCompIds() {
		List<KComponent> kcLst = cacheKComponentRepository.findByCompDefId("allContents");
		Map<String, String> map = new HashMap<String, String>();
		for (KComponent kComponent : kcLst) {
			List<KPatternComp> kpcLst = cacheKPatternCompRepository.findByComId(kComponent.getId());
			for (KPatternComp kPatternComp : kpcLst) {
				map.put(kComponent.getId(), kPatternComp.getKPattern().getId());
			}
		}
		return map;
	}

	/**
	 * 用于计算栏目DN下内容全集COMID的分页数量
	 * 
	 * @return
	 */
	public int loadCompNum(String dn) {
		Integer num = acheHContentSubjectRepository.sumContentInDnAndComId("3", dn);
		int pages = (int) Math.ceil(((double) num) / 20);
		if (pages > 0) {
			return pages;
		} else {
			return -1;
		}
	}
}
