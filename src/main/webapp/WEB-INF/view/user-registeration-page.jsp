<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please Register here</h1>

	<form:form modelAttribute="user_registeration">
		<label>User : </label>
		<form:input path="name" />
		
	</form:form>
</body>
</html>