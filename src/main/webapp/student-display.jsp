<%@ page import="java.util.List" %>
<%@ page import="com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student" %>
<%@ page import="com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    HttpSession session1 = request.getSession(false);

    if (session1 == null || session1.getAttribute("userSession") == null) {
        response.sendRedirect("student-login.jsp");
        return;
    }
    
    
%>



<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Records</title>
</head>

<body>

<%
    StudentDao dao = new StudentDao();
    List<Student> students = dao.getAllStudentDao();
%>

<h1>Student Records</h1>

<% if (students != null && !students.isEmpty()) { %>

<div class="table-box">
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>PHONE</th>
            <th>ADDRESS</th>
            <th>DOB</th>
            <th colspan="2">ACTION</th>
        </tr>

        <% for (Student student : students) { %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getEmail() %></td>
            <td><%= student.getPhone() %></td>
            <td><%= student.getAddress() %></td>
            <td><%= student.getDob() %></td>
            <td>
                <a href="deletestudent?id=<%= student.getId() %>" class="btn btn-delete">Delete</a>
            </td>
            <td>
                <a href="student-update.jsp?id=<%= student.getId() %>" class="btn btn-edit">Edit</a>
            </td>
        </tr>
        <% } %>

    </table>
</div>

<% } else { %>
    <h3 style="text-align:center;color:red;">No Students Found</h3>
<% } %>

<br>
<a href="logout" class="btn btn-danger">Logout</a>

</body>
</html>
