package com.syntis.service;

import java.util.List;
import java.util.Map;

import com.syntis.bean.CoreItem;

public interface CoreItemService {
	List<CoreItem> queryCoreItem();
	List<Map<String,Integer>> queryCountForCharts();
}
