package com.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.HouseDao;
import com.ssm.entity.House;
import com.ssm.service.HouserService;

@Service
public class HouserServiceImpl implements HouserService{
	
	@Autowired
	private HouseDao houseDao;

	@Override
	public ArrayList<House> selectAll(House h) {
		return houseDao.selectAll(h);
	}
	
	
}
