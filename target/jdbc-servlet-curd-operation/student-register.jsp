<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration-Page</title>
</head>
<body>
		
		
 	<form action="registerStudent" method="get">
<div class="center-page">
    <div class="form-box">
       
      
		
		<label>ID:</label><br>
		<input type="number" placeholder="enter student id" name="id"><br>
		<label>NAME:</label><br>
		<input type="text" placeholder="enter student name" name="name"><br>
		<label>EMAIL:</label><br>
		<input type="email" placeholder="enter student email" name="email"><br>
		<label>PASSWORD:</label><br>
		<input type="password" placeholder="enter student password" name="password"><br>
		<label>PHONE:</label><br>
		<input type="tel" placeholder="enter student phone" name="phone"><br>
		<label>ADDRESS:</label><br>
		<input type="text" placeholder="enter student address" name="address"><br>
		<label>DOB:</label><br>
		<input type="date" name="dob"><br><br>
		<input type="submit" value="REGISTER">
    </div>
</div>



	</form>

	
</body>
</html>