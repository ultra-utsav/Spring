<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%response.setHeader("cahce-control","no-cache, no-store, must-revalidate"); %>
<body>
	<!-- for two way binding you have to this kind of work -->
	
	<form:form action="register" method="post" modelAttribute="user">
		<div>
			<div>
				<label for="id">Id:</label><form:input path="id" id="id" />
			</div>
			<br>
			<div>
				<label for="name">Name:</label><form:input path="name" id="name" />
			</div>
			<br>
			<div>
				<label for="college">College:</label><form:input  path="college" id="college" />
			</div>
			<br>
			<div>
				<label for="password">Password:</label><form:input  path="password1" id="password1" />
			</div>
			<br>
			<div>
				<label for="password">Confirm Password:</label><form:input  path="password2" id="password2" />
			</div>
			<br>
			<input type="submit" value="Register" />
		</div>
	</form:form>
	
	<!--
	if you want to achieve only one way binding then you can used following approach
	<form action="register" method="post" >
		<div>
			<div>
				<label for="id">Id:</label><input name="id" id="id" />
			</div>
			<br>
			<div>
				<label for="name">Name:</label><input name="name" id="name" />
			</div>
			<br>
			<div>
				<label for="college">College:</label><input  name="college" id="college" />
			</div>
			<br>
			<div>
				<label for="password">Password:</label><input  name="password1" id="password1" />
			</div>
			<br>
			<div>
				<label for="password">Confirm Password:</label><input  name="password2" id="password2" />
			</div>
			<br>
			<input type="submit" value="Register" />
		</div>
	</form:form> 
	 -->
</body>
</html>