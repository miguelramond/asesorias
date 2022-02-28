<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · capacitacion++</title>
<%@ include file="./commons/head.jsp"%>
</head>
<body id="crearcapacitacion">

	<%@ include file="./commons/menu.jsp"%>

	<main>
		<form:form method="POST" action="/asesorias/crearcapacitacion?=crear"
			modelAttribute="capacitacion" class="needs-validation"
			novalidate="novalidate">
			<div class="form-row justify-content-center">
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="rutcliente">Rut Cliente</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Solo números, sin guión"
						path="rutcliente" required="required" />
					<div class="invalid-feedback">¡Importante saber el RUT del
						cliente!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label path="dia">Dia</form:label>
					<form:input type="text" class="form-control"
						placeholder="Todo junto, solo numeros: 01012022" path="dia"
						required="required" />
					<div class="invalid-feedback">Favor ingresar dia de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label path="hora">Hora</form:label>
					<form:input type="text" class="form-control"
						placeholder="Todo junto, solo numeros: 0900" path="hora"
						required="required" />
					<div class="invalid-feedback">Favor ingresar hora de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label path="lugar">Lugar</form:label>
					<form:input type="text" class="form-control"
						placeholder="Ej: Sede Awakelab" path="lugar" required="required" />
					<div class="invalid-feedback">Favor ingresar lugar de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label path="duracion">Duracion</form:label>
					<form:input type="text" class="form-control"
						placeholder="En horas. Ej: 2" path="duracion" required="required" />
					<div class="invalid-feedback">Favor ingresar duración (en
						horas) de la capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label path="qty">Qty</form:label>
					<form:input type="text" class="form-control"
						placeholder="Solo numeros: 25" path="qty" required="required" />
					<div class="invalid-feedback">Favor ingresar cantidad de
						asistentes que irán a la capacitacion</div>
				</div>
			</div>
			<div class="form-row justify-content-center mt-1">
				<button class="btn btn-primary col-md-2" type="submit">Agregar</button>
			</div>
			<div class="form-row justify-content-center mt-1">
				<a id="listarcapacitacion" class="btn btn-primary"
					href="./listarcapacitacion" role="button">Listar Capacitaciones</a>
			</div>

		</form:form>


		<!--  VERSION ORIGINAL FOR JPA 
		<form:form method="POST" action="/asesorias/crearcapacitacion?=crear"
			modelAttribute="capacitacion">
			<table>
				<tr>
					<td><form:label path="rutcliente">Rut Cliente</form:label></td>
					<td><form:input path="rutcliente" /></td>
				</tr>
				<tr>
					<td><form:label path="dia">Dia</form:label></td>
					<td><form:input path="dia" /></td>
				</tr>
				<tr>
					<td><form:label path="hora">Hora</form:label></td>
					<td><form:input path="hora" /></td>
				</tr>
				<tr>
					<td><form:label path="lugar">Lugar</form:label></td>
					<td><form:input path="lugar" /></td>
				</tr>
				<tr>
					<td><form:label path="duracion">Duracion</form:label></td>
					<td><form:input path="duracion" /></td>
				</tr>
				<tr>
					<td><form:label path="qty">Qty</form:label></td>
					<td><form:input path="qty" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form> -->

		<!-- FORM PRE-SPRING PARA REFERENCIA 
		<form action="?parametro=crear" class="needs-validation" method="post"
			novalidate>
			<div class="form-row justify-content-center">
				<div class="col-md-4 mb-3">
					<label for="validationCustom03">RUT Cliente</label> <input
						type="text" class="form-control" id="validationCustom03"
						placeholder="Solo números, sin guión" name="rutcliente" required>
					<div class="invalid-feedback">¡Importante saber el RUT del
						cliente!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom04">Dia</label> <input type="text"
						class="form-control" id="validationCustom04"
						placeholder="Todo junto, solo numeros. Ej: 01012022" name="dia"
						required>
					<div class="invalid-feedback">Favor ingresar dia de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom04">Hora</label> <input type="text"
						class="form-control" id="validationCustom04"
						placeholder="Todo junto, solo numeros. Ej: 0900" name="hora"
						required>
					<div class="invalid-feedback">Favor ingresar hora de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom04">Lugar</label> <input type="text"
						class="form-control" id="validationCustom04"
						placeholder="Ej: Sede Awakelab" name="lugar" required>
					<div class="invalid-feedback">Favor ingresar lugar de la
						capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom04">Duracion</label> <input type="text"
						class="form-control" id="validationCustom04"
						placeholder="En horas. Ej: 2" name="duracion" required>
					<div class="invalid-feedback">Favor ingresar duración (en
						horas) de la capacitacion</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom04">Cantidad Asistentes</label> <input
						type="text" class="form-control" id="validationCustom04"
						placeholder="Solo numeros. Ej: 25" name="qty" required>
					<div class="invalid-feedback">Favor ingresar cantidad de
						asistentes que irán a la capacitacion</div>
				</div>
			</div>
			<div class="form-row justify-content-center mt-1">
				<button class="btn btn-primary col-md-2" type="submit">Agregar</button>
			</div>
			<div class="form-row justify-content-center mt-1">
				<a id="login" class="btn btn-primary" href="./listarcapacitacion" role="button">Listar
					Capacitaciones</a>
			</div>
		</form> -->
	</main>

	<%@ include file="./commons/footer.jsp"%>

	<script src="<core:url value="/res/js/main.js"/>"></script>
</body>
</html>