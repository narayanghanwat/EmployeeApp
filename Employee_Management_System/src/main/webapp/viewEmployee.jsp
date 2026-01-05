<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="java.util.*,com.tka.model.Employee"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<h1 style="color:green"> Employee Details</h1>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Employee Name</td>
			<td>Age</td>
			<td>Email</td>
			<td>Designation</td>
			<td>Salary</td>
		</tr>
		<c:forEach var="employee" items="${empList}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.age}</td>
				<td>${employee.email}</td>
				<td>${employee.designation}</td>
				<td>${employee.salary}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="home.jsp">Home</a>

	<br>
	<br>
	
	
</body>
</html>