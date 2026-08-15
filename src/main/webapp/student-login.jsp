<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login-Page</title>
</head>
<body>

	
<div class="center-page">
    <div class="form-box">
        <script type="text/javascript">
			
		</script>
		<form action="loginStudent" method="post">
		
		<label>Email:</label><br>
		<input type="email" placeholder="enter student email" name="email"><br>
		<label>Password:</label><br>
		<input type="password" placeholder="enter student password" name="password"><br>
		<input type="submit" value="LOGIN"><br>
		
	
		</form>
    </div>
</div>

		<%@ include file="footer.jsp" %>
		
</body>
</html>