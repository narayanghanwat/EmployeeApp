<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Employee</title>
</head>
<body>

	
<c:if test="${not empty msg}">
    <script>
        alert("${msg}");
    </script>
</c:if>

<h1 style="color:red">Register Employee</h1>
	
	<form action="/save-employee" method = "POST">
	Enter Name : <input type="text" id="name" name ="name">
	<br><br>
	Enter Age : <input type="text" id="age" name ="age">
	<br><br>
	Enter Email : <input type="email" id="email" name ="email">
	<br><br>
	Enter Designation : <input type="text" id="designation" name ="designation">
	<br><br>
	Enter Salary : <input type="text" id="salary" name ="salary">
	<br><br>
	<input type = "submit" value="Register">
	</form>
	
	<a href="home.jsp">Home</a>

	<br>
	<br>
</body>
</html>