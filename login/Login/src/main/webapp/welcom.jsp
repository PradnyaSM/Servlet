<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("username")==null){
		response.sendRedirect("Login.jsp");
	}

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

%>
<!------------------------------------------------------------------------------------------->
	Heyy ${username}
	<br> This is Pradrnya-Learning jsp from Navin!<br>
	<a href="videos.jsp">open videos</a>
</body>
</html>