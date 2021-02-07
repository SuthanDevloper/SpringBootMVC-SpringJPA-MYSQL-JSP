<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	
</style>
</head>
<body>
<table border="1">
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>SALARY</td>
		<td>HRA</td>
		<td>TA</td>
		<td>DEPT</td>
		<td>ADDR</td>
		<td>Delete</td>
		<td>Edit</td>
	</tr>
	<c:forEach items="${list }" var="emp">
		<tr>
			<td>${emp.id }</td>
		<td>${emp.name }</td>
		<td>${emp.sal }</td>
		<td>${emp.hra}</td>
		<td>${emp.ta }</td>
		<td>${emp.dept }</td>
		<td>${emp.addr }</td>
		<td>
			<a href="delete?id=${emp.id}">Delete</a>
		</td>
		<td>
			<a href="edit?id=${emp.id}">Edit</a>
		</td>
		</tr>
	</c:forEach>
	
	

</table>
</body>
</html>