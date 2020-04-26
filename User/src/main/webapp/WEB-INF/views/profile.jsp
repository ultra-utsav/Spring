<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("cahce-control", "no-cache, no-store, must-revalidate");
		String s = (String) session.getAttribute("user");
		System.out.println(s);
		if (s == null) {
			System.out.println("hii");
			response.sendRedirect("login.jsp");
		}
	%>
	<div>
		<br>
		<br>
		<center>
			<h1>
				<b>User Details</b>
			</h1>
			<hr>
			<table bordercolor="black">
				<tr bordercolor="black">
					<c:forEach items="${object}" var="val">
						<td><c:out value="${val}" /></td>
					</c:forEach>
				</tr>
			</table>
			<br>
			<form action="logout" method="post">
				<input type="submit" value="Logout" />
			</form>
		</center>
	</div>
</body>
</html>