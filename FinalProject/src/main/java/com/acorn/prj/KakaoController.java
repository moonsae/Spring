package com.acorn.prj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KakaoController {
	
	@GetMapping("/logintest")
	public String logintest() {
		return "logintest";
	}
	

}
