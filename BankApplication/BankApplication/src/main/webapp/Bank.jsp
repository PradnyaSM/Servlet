<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Portal</title>

<!--  <style>
    body {
        font-family: "Segoe UI", Arial, sans-serif;
        background-color: #f8f9fa;
        color: #333;
        text-align: center;
        margin: 0;
        padding: 0;
    }
    
    h2 {
        color: #0077b6;
        margin-bottom: 20px;
    }
    input[type="text"], input[type="submit"] {
        padding: 10px 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 15px;
    }
    input[type="submit"] {
        background-color: #0077b6;
        color: white;
        
    }
    input[type="submit"]:hover {
        background-color: #005f87;
    }
    a {
        text-decoration: none;
        color: #0077b6;
        font-weight: 500;
    }
    a:hover {
        text-decoration: underline;
    }
</style>
-->
</head>
<body >
<h2>Welcome to Maha-Bank</h2>

<form action="balancecheck.jsp" method="post">

<label for="customerid">Enter Customer Id:</label><br>
<input type="text" id="customerid" name="customerid" required><br><br>
<input type="submit" value="Check Balance">

</form>
</body>
</html>