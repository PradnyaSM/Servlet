package com.pradnya;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/submitInfo")
public class InfoServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String department = req.getParameter("department");
        String designation = req.getParameter("designation");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");

        // Simple server-side validation example
        String error = null;
        if (name == null || name.trim().isEmpty()) { error = "Name is required"; }
        else if (id == null || id.trim().isEmpty()) { error = "ID is required"; }
        else if (email == null || email.trim().isEmpty()) { error = "Email is required"; }

        if (error != null) {
            req.setAttribute("error", error);
            RequestDispatcher rd = req.getRequestDispatcher("/form.html");
            rd.forward(req, resp);
            return;
        }
        
        // Create a simple Java bean-like map (or create a Student class)
        Student student = new Student(name, id, email, phone, department, designation, gender, dob, address);

        req.setAttribute("student", student);

        // Save to application scope list (in-memory)
        ServletContext ctx = req.getServletContext();
        synchronized (ctx) {
            List<Student> list = (List<Student>) ctx.getAttribute("students");
            if (list == null) {
                list = new ArrayList<>();
                ctx.setAttribute("students", list);
            }
            list.add(student);
        }
        

        
        RequestDispatcher rd = req.getRequestDispatcher("/result.html");
        rd.forward(req, resp);

}

}
