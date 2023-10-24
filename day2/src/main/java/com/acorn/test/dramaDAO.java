package com.acorn.test;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dramaDAO {
	
	@Autowired
	DataSource ds;
	
	ArrayList<Drama11> dramaList = new ArrayList<>();
	
	public ArrayList<Drama11> getDrama() {
		String sql = "select * from drama_tbl";
		Connection con=null;
		try {
			con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String code = rs.getString(1);
				String title =  rs.getString(2);
				String actors = rs.getString(3);
				dramaList.add(new Drama11(code, title, actors));
				System.out.println(code);
				System.out.println(title);
				System.out.println(actors);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return dramaList;
	}

}
