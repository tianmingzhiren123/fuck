package com.ssm.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.House;
import com.ssm.service.HouserService;

@Controller
public class HouseController {
	@Autowired
	private HouserService houserServiceImpl;
	
	@RequestMapping(value="/selectAll.do")
	public @ResponseBody ArrayList<House> selectAll(House h,HttpServletResponse resp) {
		resp.setContentType("application/json;charset=utf-8");
		System.out.println(h + "1111");
		ArrayList<House> housess = houserServiceImpl.selectAll(h);
		if( null != housess) {
			return housess;
		}else {
			return null;
		}
	}
}
