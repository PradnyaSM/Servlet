<!DOCTYPE html>
<html>
<head>
    <title>Student Grade Calculator</title>
</head>
<body>
    <h2>Student Marks Entry</h2>

    <% if (request.getAttribute("error") != null) { %>
        <div style="color:red"><%= request.getAttribute("error") %></div><br>
    <% } %>

    <form action="GradeServlet" method="post">
        Student Roll: <input type="text" name="roll" required><br><br>
        Name: <input type="text" name="name" required><br><br>

        Subject 1 Marks[WT]: <input type="number" name="sub1" min="0" max="100" required><br><br>
        Subject 2 Marks[ADS]: <input type="number" name="sub2" min="0" max="100" required><br><br>
        Subject 3 Marks[STQA]: <input type="number" name="sub3" min="0" max="100" required><br><br>

        <input type="submit" value="Calculate Grade">
    </form>
</body>
</html>
