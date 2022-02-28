<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cl.awakelab.asesorias.*"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · login</title>
	<%@ include file="./commons/head.jsp"%>
</head>
<body>

	<%@ include file="./commons/menu.jsp"%>
	
	<%
	String error = (String) request.getAttribute("error");
		if (error != null && error.equals("true")) {
			out.println("<h3 class='alert alert-danger'> Error de Autenticación </h3>");
		}
	%>
	

	<form action="${pageContext.request.contextPath}/login" style="padding-top: 1vw;"
		method="post">

		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname"> 
			<label for="psw"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="psw">

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>

	<%@ include file="./commons/footer.jsp"%>

</body>

</html>