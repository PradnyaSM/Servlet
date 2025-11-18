<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" import="java.util.*" %>

<%
	Map<String,Double> customerBalances = new HashMap<String,Double>();
    customerBalances.put("c001", 25000.0);
    customerBalances.put("c002",75000.0);
    customerBalances.put("c003",-1200.0);
    customerBalances.put("c004",50000.0);
    
    String customerId = request.getParameter("customerid");
    Double balance = customerBalances.get(customerId);
    
    if(balance==null){
    	response.sendRedirect("UnknownCustomer.jsp");
   	
    }
    else if(balance < 0){
    	response.sendRedirect("negativebalance.jsp");
    }
    else if(balance < 50000){
    	response.sendRedirect("regularCustomer.jsp?balance="+balance);
    }
    else{
    	response.sendRedirect("eliteCustomer.jsp?balance="+balance);
    }
%>
</body>
</html>