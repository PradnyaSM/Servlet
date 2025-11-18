package com.pradnya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GradeServlet")
public class GradeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int Roll = Integer.parseInt(req.getParameter("roll"));
		String name = req.getParameter("name");
		int sub1 = Integer.parseInt(req.getParameter("sub1")) ;
		int sub2 = Integer.parseInt(req.getParameter("sub2")) ;
		int sub3 = Integer.parseInt(req.getParameter("sub3")) ;
		
		int total = sub1+sub2+sub3;
		int percent = (total*100)/3;
		String grade ;
		if(percent>80) {
			grade = "A";
		}
		 else if (percent >= 60) grade = "B";
         else if (percent >= 50) grade = "C";
         else grade = "D";
//		-----------------------------------------------------------------------------
//		jdbc-
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String pass = "Rose@1234"; 
            
            Connection con = DriverManager.getConnection(url, user, pass);
            String insertSql = "INSERT INTO students_info (Roll, Name, Percent_marks, Garde) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSql);
            ps.setInt(1,Roll);
            ps.setString(2, name);
            ps.setInt(3, percent);
            ps.setString(4, grade);
            
            int i = ps.executeUpdate();
            if(i>0) {
            	System.out.println("success");
            }
            
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		--------------------------------------------------------------------------
		req.setAttribute("percent", percent);
		req.setAttribute("grade", grade);
		 RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
	     rd.forward(req, res);
		
	}
	
	
}
