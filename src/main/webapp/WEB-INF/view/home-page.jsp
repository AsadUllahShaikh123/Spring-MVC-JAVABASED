<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">Love Calculator</h1>
	<hr/>
	<form:form action="process-homepage" modelAttribute="userInfo">
		<div align="center">

			<p>
				<label for="name">Your Name : </label> <form:input 
					path="name" id="name" />
			</p>
			<p>
				<label for="crush">Your Crush : </label> <form:input 
					path="crush" id="crush" />
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>