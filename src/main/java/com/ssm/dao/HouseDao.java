package com.ssm.dao;

import java.util.ArrayList;

import com.ssm.entity.House;

public interface HouseDao {
	
	ArrayList<House> selectAll(House h);
}
