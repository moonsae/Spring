package com.acorn.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 

@Component
public class MemberService {	
	@Autowired
	MemberDAO dao;
	
	public ArrayList<Member> getMemberList(){
		return dao.select();
	}
		
	
	
}
