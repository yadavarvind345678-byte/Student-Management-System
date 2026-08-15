<%@page import="com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
    
<%@ page import="com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<%
		int id = Integer.parseInt(request.getParameter("id"));
		Student student= new StudentDao().getStudentByIdDao(id);
	    %>
		<%
    HttpSession s = request.getSession(false);
    if (s == null || s.getAttribute("userSession") == null) {
        out.println("<script>alert('Session expired! Please login again'); window.location='student-login.jsp';</script>");
        return;
    }
%>
		

		
		
		<form action="update-student" method="post">
		<h1>Update Student</h1>
<div class="table-box">
  
      <label>ID:</label><br>
		<input type="number"  name="id" value="<%=id %>" readonly="readonly"><br>
		<label>NAME:</label><br>
		<input type="text"  name="name" value="<%=student.getName() %>"><br>
		<label>EMAIL:</label><br>
		<input type="email"  name="email" value="<%=student.getEmail() %>"><br>
		<label>PASSWORD:</label><br>
		<input type="password"  name="password" value="<%=student.getPassword()%>"><br>
		<label>PHONE:</label><br>
		<input type="tel"  name="phone" value="<%=student.getPhone() %>"><br>
		<label>ADDRESS:</label><br>
		<input type="text"  name="address" value="<%=student.getAddress() %>"><br>
		<label>DOB:</label><br>
		<input type="date" name="dob" value="<%=student.getDob() %>"><br><br>
		<input type="submit" value="Update">
 
</div>
		
		
		
	</form>
	<%@ include file="footer.jsp" %>
	
</body>
</html>