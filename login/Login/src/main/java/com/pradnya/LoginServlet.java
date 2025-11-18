package com.pradnya;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pradnya.Dao.LoginDao;

//@WebServlet("/login")
//
//public class LoginServlet extends HttpServlet {
//	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
////		1) here if we use url for welcom page, without login we get to use that page-solu=>session
//		
//		if(username.equals("Telusko") && password.equals("123")) {
////			-----------------------------------------------------------
//			HttpSession session = req.getSession();
//			session.setAttribute("username", username);
////			------------------------------------------------------------
//			res.sendRedirect("welcom.jsp");
//		}
//		else {
//			res.sendRedirect("Login.jsp");
//		}	
//	}
//}

//

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
	String username = req.getParameter("username");
	String password = req.getParameter("password");

	LoginDao dao = new LoginDao();
	if(dao.check(username, password)) {
//		-----------------------------------------------------------
		HttpSession session = req.getSession();
		session.setAttribute("username", username);
//		------------------------------------------------------------
		res.sendRedirect("welcom.jsp");
	}
	else {
		res.sendRedirect("Login.jsp");
	}	
}
}


