<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>
<h2>Student Result</h2>

<% if (request.getAttribute("roll") == null && request.getAttribute("error") != null) { %>
    <div style="color:red"><%= request.getAttribute("error") %></div>
    <p><a href="index.jsp">Back</a></p>
<% } else { %>
<table border="1" cellpadding="8">
<tr><th>Roll No</th><td><%= request.getParameter("roll") %></td></tr>
<tr><th>Name</th><td><%= request.getParameter("name") %></td></tr>
<tr><th>Subject 1</th><td><%= request.getParameter("sub1") %></td></tr>
<tr><th>Subject 2</th><td><%= request.getParameter("sub2") %></td></tr>
<tr><th>Subject 3</th><td><%= request.getParameter("sub3") %></td></tr>

<tr><th>Percentage</th><td><%= request.getAttribute("percent") %></td></tr>
<tr><th>Grade</th><td><%= request.getAttribute("grade") %></td></tr>
</table>

<br>
<a href="form.jsp">Add Another Student</a>
<% } %>
</body>
</html>
