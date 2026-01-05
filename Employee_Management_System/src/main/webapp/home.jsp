<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<c:if test="${not empty msg}">
		<script>
			alert("${msg}");
		</script>
	</c:if>
	<h1 style="color: blue">HOME PAGE</h1>


	<a href="registerEmployee.jsp">Register Employee</a>

	<br>
	<br>
	<a href="/get-all-employee-details">get all employee details</a>
</body>
</html>