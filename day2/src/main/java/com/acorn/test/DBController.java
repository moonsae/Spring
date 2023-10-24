package com.acorn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DBController {

	@Autowired
	TestDAO dao;
	
	@RequestMapping("/dbTest")
	public String test1() {
		dao.select();
		return "db";
	}
}