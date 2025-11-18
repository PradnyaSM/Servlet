<%@ page import="java.util.List" %>
<%@ page import="com.pradnya.Student" %>
<%
  Student s = (Student) request.getAttribute("student");
  List<Student> all = (List<Student>) application.getAttribute("students");
%>
<!doctype html>
<html>
<head><meta charset="utf-8"><title>Result</title></head>
<body>
  <h2>Submitted Information</h2>
  <p>Name: <%= s.getName() %></p>
  <p>ID: <%= s.getId() %></p>
  <p>Email: <%= s.getEmail() %></p>
  <p>Phone: <%= s.getPhone() %></p>
  <p>Department: <%= s.getDepartment() %></p>
  <p>Designation: <%= s.getDesignation() %></p>
  <p>Gender: <%= s.getGender() %></p>
  <p>DOB: <%= s.getDob() %></p>
  <p>Address: <%= s.getAddress() %></p>

  <h3>All Entries</h3>
  <ul>
  <% if (all != null) {
       for (Student st : all) { %>
         <li><%= st.getName() %> - <%= st.getId() %> - <%= st.getEmail() %></li>
  <%    }
     } else { %>
       <li>No entries yet.</li>
  <% } %>
  </ul>
  <a href="Form.html">Submit another</a>
</body>
</html>
