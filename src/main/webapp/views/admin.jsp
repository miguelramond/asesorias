<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cl.awakelab.asesorias.*"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · admin</title>
<%@ include file="./commons/head.jsp"%>
</head>
<body>

	<%@ include file="./commons/menu.jsp"%>

	<h2 style="text-align: center; padding: 1vw 0vw 1vw 0vw;">
		<b>Panel Admin:</b>
	</h2>

	<div class="form-row justify-content-center mt-1">
		<a id="admin" class="btn btn-primary" href="./listarusuario"
			role="button">Listar Usuarios</a>
	</div>
	<div class="form-row justify-content-center mt-1">
		<a id="admin" class="btn btn-primary" href="./crearusuario"
			role="button">Crear Usuario</a>
	</div>

	<!-- SE RETIRA TAGLIB HASTA IMPLEMENTAR LOGIN Y SESIONES -->
	<!-- <core:set var="admin" scope="session" value="${admin}" />
	<core:if test="${admin == true}"> -->

	<!-- </core:if> -->

	<%@ include file="./commons/footer.jsp"%>

</body>
</html>