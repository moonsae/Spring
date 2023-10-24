package com.acoron.exception;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;

@Controller
public class ExceptionCatcher {

	public String method1() {
		String view="view1";
		try {
			throw new SQLException();
			
		}catch(SQLException ex) {
			//오류발생했을 때 error페이지가 보일 수 있도록
			view="err";
		}
		return view;
	}
}
