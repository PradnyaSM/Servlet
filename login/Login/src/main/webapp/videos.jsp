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
    <a href="https://www.google.com">Google</a>
	<a href="https://www.youtube.com/">Youtube</a>
	
	<form action="Logout">
		<input type="submit" value="logout">
	</form>
	
</body>
</html>