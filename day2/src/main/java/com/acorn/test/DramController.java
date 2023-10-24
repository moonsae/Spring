package com.acorn.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DramController {

	@Autowired
	dramaDAO drama;
	
	@RequestMapping("/drama11")
	public String test(Model model) {
		ArrayList<Drama11> dramaList = new ArrayList<>();
		dramaList = drama.getDrama();
		model.addAttribute("dramaList",dramaList);
		return "drama11";
	}
	
	
}
