package com.acorn.open.naver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NjController {
	
	@Autowired
	Njtest api;
	
	
	@ResponseBody
	@GetMapping( value="/njApi"  , produces = "application/json;charset=utf-8" )
	public String naverShop() {
		
		return api.getNaver();
	}

}
