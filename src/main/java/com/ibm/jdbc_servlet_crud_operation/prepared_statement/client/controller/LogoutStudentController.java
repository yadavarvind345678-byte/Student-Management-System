package com.ibm.jdbc_servlet_crud_operation.prepared_statement.client.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutStudentController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<script>");
        out.println("alert('You are logged out successfully');");
        out.println("window.location='student-login.jsp';");
        out.println("</script>");
        out.println("</body></html>");
    }
}

