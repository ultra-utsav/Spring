<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<%
		response.setHeader("cahce-control", "no-cache, no-store, must-revalidate");
	%>
	<div>
		<br>
		<br>
		<center>
		<h1><b>Login</b></h1>
		<hr>
			<form action="login" method="post">
				<div>
					<div>
						<label for="username">Username:</label> <input type="text"
							name="username" id="username">
					</div>
					<br>
					<div>
						<label for="password">Password:</label> <input type="password"
							name="password" id="password">
					</div>
					<br> <input type="submit">
				</div>
			</form>
		</center>
	</div>
</body>
</html>