<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>EMPLOYEE EDIT </h3>
<form:form action="update" method="POST" modelAttribute="employee">
<pre>
ID   : <form:input path="id" readonly="true"/>
NAME : <form:input path="name"/>
SAL  : <form:input path="sal"/>
DEPT : <form:select path="dept">
			<form:option value="">-SELECT-</form:option>
			<form:option value="DEV">DEV</form:option>
			<form:option value="HR">HR</form:option>
			<form:option value="BA">BA</form:option>
			<form:option value="QA">QA</form:option>
		</form:select>
ADDR: <form:textarea path="addr"/>		
		<input type="submit" value="Update"/>
</pre>
</form:form>
</body>
</html>