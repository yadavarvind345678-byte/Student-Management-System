package com.ibm.jdbc_servlet_crud_operation.prepared_statement.client.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao;
import com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentClientController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String address = req.getParameter("address");
		long phone = Long.parseLong(req.getParameter("phone"));
		LocalDate dob = LocalDate.parse(req.getParameter("dob"));

		Student student = new Student();

		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setPassword(pass);
		student.setAddress(address);
		student.setPhone(phone);
		student.setDob(dob);

		StudentDao dao = new StudentDao();

		int a = dao.saveStudentDao(student);

		PrintWriter printWriter = resp.getWriter();

		if (a != 0) {
			System.out.println("data saved!!!!!");
			printWriter.write("<html><body><script>alert('you are registered successfully');</script></body></html>");
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("student-login.jsp");
			dispatcher.include(req, resp);

		} else {
			System.out.println("Something Went Wrong.........");
			printWriter.write("<html><body><script>alert('something went wrong');</script></body></html>");

			RequestDispatcher dispatcher =
					req.getRequestDispatcher("student-register.jsp");
			dispatcher.include(req, resp);
		}
	}
}
