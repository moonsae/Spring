package com.acorn.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//매핑을 매서드 단위로 한다

//Q.1
@Controller
public class TestController {
	@Autowired
	TestService service;
	@RequestMapping("/gugudan")
	public String test1(@RequestParam(required=false, defaultValue="2") int dan, Model model) {
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list",danList);
		System.out.println(dan);
		
		return"test";
	}
	@RequestMapping("/moive")
	public String test2(Model model) {
		ArrayList<Movie> movieList= service.getMovieList();
		System.out.println("영화정보출력");
		model.addAttribute("movieList",movieList);
		return "test2";
	}
}
