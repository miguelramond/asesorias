<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cl.awakelab.asesorias.*"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · capacitaciones</title>
	<%@ include file="./commons/head.jsp"%>
<body id="publica">

	<%@ include file="./commons/menu.jsp"%>

	<main>
		<h1 style="text-align: center; padding: 1vw 0vw 1vw 0vw;">
			<b>Capacitaciones</b>
		</h1>

		<!--  Implementación de mostrar todos elementos en DB 'capacitaciones' -->
		<table id="tabla1" class="display"
			style="text-align: center; width: 100%">

			<thead>
				<tr>
					<th>ID Cap.</th>
					<th>RUT</th>
					<th>Dia</th>
					<th>Hora</th>
					<th>Lugar</th>
					<th>Duracion</th>
					<th>Qty</th>
					<th>Acción</th>
				</tr>
			</thead>

			<tbody>
				<core:forEach var="c" items="${capacitacion}">
					<tr>
						<td><core:out value="${c.getId()}"></core:out></td>
						<td><core:out value="${c.getrutcliente()}"></core:out></td>
						<td><core:out value="${c.getDia()}"></core:out></td>
						<td><core:out value="${c.getHora()}"></core:out></td>
						<td><core:out value="${c.getLugar()}"></core:out></td>
						<td><core:out value="${c.getDuracion()}"></core:out></td>
						<td><core:out value="${c.getQty()}"></core:out></td>
						<td><a href="Actualizar?id=${c.getId()}"><button class="btn btn-primary" type="submit">
						Actualizar</button></a></td>

					</tr>
				</core:forEach>
			</tbody>
		</table>
		
	</main>

	<%@ include file="./commons/footer.jsp"%>

	<script src="<core:url value="/res/js/main.js"/>"></script>
</body>
</html>


