package com.tianya.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @Author: yizhen
 * @Date: 2018/12/18 18:31
 */
@Service
@Slf4j
public class PoiTest {

	private static final String filePath = "C:/Users/Chang/Desktop/test2.xls";

	public static void poiShow() throws Exception {

		File file = new File(filePath);
		List<String> list = Lists.newArrayList("执御商品ID", "执御SKUID", "商家价格");
		List<Map<String, Object>> lists = ExcelUtil.readExcel(file, list);
		lists.forEach((x) -> {
			System.out.println(x);
		});
		System.out.println(lists.size());
	}

	public static void main(String[] args) throws Exception {
		Map<String, Object> map = Maps.newHashMap();
		for (Map.Entry<String, Object> mp : map.entrySet()) {

		}
	}
}

// 12.66  => 12  66
// 12.6   => 12  6
// 12     => 12



