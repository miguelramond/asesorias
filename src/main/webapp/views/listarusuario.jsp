
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cl.awakelab.asesorias.*"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · usuarios</title>
<%@ include file="./commons/head.jsp"%>
<body id="publica">

	<%@ include file="./commons/menu.jsp"%>

	<main>
		<h1 style="text-align: center; padding: 1vw 0vw 1vw 0vw;">
			<b>Usuarios Registrados</b>
		</h1>

		<!--  Implementación de mostrar todos elementos en DB 'cosas' -->
		<table id="tabla1" class="display"
			style="text-align: center; width: 100%">

			<thead>
				<tr>
					<th>ID Usuario</th>
					<th>Nombre</th>
					<th>Nombre Usuario</th>
					<th>Fecha Nac.</th>
					<th>RUN</th>
					<th>Tipo Usuario</th>
				</tr>
			</thead>

			<tbody>
				<core:forEach var="c" items="${usuario}">
					<tr>
						<td><core:out value="${c.getIdusuario()}"></core:out></td>
						<td><core:out value="${c.getNombre()}"></core:out></td>
						<td><core:out value="${c.getUname()}"></core:out></td>
						<td><core:out value="${c.getFecha_nac()}"></core:out></td>
						<td><core:out value="${c.getRun()}"></core:out></td>
						<td><core:out value="${c.getTipousuario()}"></core:out></td>
						<td><a href="ActualizarUsuario?id=${c.getIdusuario()}"><button
							class="btn btn-primary" type="submit">Actualizar</button></a></td>

					</tr>
				</core:forEach>
			</tbody>
		</table>

	</main>

	<%@ include file="./commons/footer.jsp"%>

	<script src="<core:url value="/res/js/main.js"/>"></script>
</body>
</html>


