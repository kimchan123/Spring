package com.example.demo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService{

	@Autowired
	private StatisticMapper mapper;
	
	@Override
	public HashMap<String, Object> yearLoginCount(String year) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map = mapper.YearLogin(year);
		map.put("year", year);
		map.put("is_success", true);
		return map;
	}
	
}
