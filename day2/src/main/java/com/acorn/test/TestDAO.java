package com.acorn.test;

import java.sql.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	
	@Autowired
	DataSource ds;
	
	/*
	 * 데이터소스를 통해 객체를 주입함
	 * 객체는 root-context.xml에서 객체를 생성했음
	 */
	public void select() {		
		String sql="select * from member_tbl_11";
		try {
			Connection con = ds.getConnection();
			PreparedStatement  pst =con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			} 			
			//
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
