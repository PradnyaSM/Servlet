package com.pradnya.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public boolean check(String username, String password) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username1 = "root";
		String pass="Rose@1234";
		
		// load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//		2)connection obj
			Connection con = DriverManager.getConnection(url,username1,pass);
			
//			3)prepare statement
			PreparedStatement ps = con.prepareStatement(
					"select * from login where name=? and password=?"
					);
			ps.setString(1, username);
			ps.setString(2, password);
			
//			4) fetch data
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.next());
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
}
