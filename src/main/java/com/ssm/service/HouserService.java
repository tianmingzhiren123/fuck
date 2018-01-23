package com.ssm.service;

import java.util.ArrayList;

import com.ssm.entity.House;

public interface HouserService {
	ArrayList<House> selectAll(House h);
}
