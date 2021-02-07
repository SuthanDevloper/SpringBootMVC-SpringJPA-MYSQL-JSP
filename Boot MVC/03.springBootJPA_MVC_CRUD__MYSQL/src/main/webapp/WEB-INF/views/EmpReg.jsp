<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register </title>
</head>
<body>
<h1>WELCOME TO EMPLOYEE REGISTER PAGE</h1>
<form action="save" method="POST" mo>
<pre>
  NAME   : <input type="text" name="name"/>
  SALARY : <input type="text" name="sal"/>
  DEPT   : <select name="dept">
   				<option value="DEV">DEV</option>
   				<option value="HR">HR</option>
   				<option value="BA">BA</option>
   				<option value="QA">QA</option>
   			</select>
  ADDRESS: <textarea name="addr"></textarea>
  <input type="submit" value="SAVE EMPLOYEE"/>   			
</pre>
</form>
${message}
</body>
</html>