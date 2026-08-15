package com.ibm.jdbc_servlet_crud_operation.prepared_statement.client.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao;
import com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LoginStudentClientController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Student student = new StudentDao().getStudentByEmailDao(email);
        PrintWriter printWriter = resp.getWriter();

        if (student != null && password.equals(student.getPassword())) {

            // 🔐 CREATE SESSION HERE
            HttpSession session = req.getSession();
            session.setAttribute("userSession", student.getEmail());
            
            //agar 30 seconds ke andar user koi activity nahi karta hai to session expire ho jayega
            session.setMaxInactiveInterval(30);
            
            // redirect to protected page
            resp.sendRedirect("student-display.jsp");

        } else {

            printWriter.write(
                "<html><body><script>alert('Invalid Email or Password');</script></body></html>");
            RequestDispatcher dispatcher = req.getRequestDispatcher("student-login.jsp");
            dispatcher.include(req, resp);
        }
    }
}
