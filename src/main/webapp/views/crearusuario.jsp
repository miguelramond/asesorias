<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cl.awakelab.asesorias.*"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<title>FyS · usuario++</title>
<%@ include file="./commons/head.jsp"%>
</head>
<body>

	<%@ include file="./commons/menu.jsp"%>

	<main>
		<form:form method="POST" action="/asesorias/crearusuario"
			modelAttribute="usuariowrapper" class="needs-validation"
			novalidate="novalidate">

			<!--  FORMULARIO BASE CON INFO DE USUARIO (SUPERCLASE) -->
			<div class="form-row justify-content-center">
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="usuario.nombre">Nombre Usuario</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Solo el primer nombre, sin apellido"
						path="usuario.nombre" required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="usuario.uname">Username</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Username único al usuario"
						path="usuario.uname" required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="usuario.psw">Contraseña</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Contraseña para ingresar al sistema."
						path="usuario.psw" required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom04"
						path="usuario.fecha_nac">Fecha de nacimiento</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom04" placeholder="Formato: DD/MM/YYYY"
						path="usuario.fecha_nac" required="required" />
					<div class="invalid-feedback">Favor ingresar la fecha de
						nacimiento del usuario</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom04" path="usuario.run">RUT Usuario</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom04"
						placeholder="Todo junto, solo numeros. Ej: 123456789"
						path="usuario.run" required="required" />
					<div class="invalid-feedback">Favor ingresar el RUT del
						usuario</div>
				</div>
			</div>

			<!-- ESTOS BOTONES RADIOS DETERMINARAN QUE PARTE DEL FORMULARIO MOSTRAR  -->
			<div class="form-row justify-content-center"
				style="padding: 1vw 0vw 1vw 0vw">
				<div class="form-check form-check-inline">
					<label class="form-check-label" for="inlineRadio1"> Cliente
					</label>
					<form:radiobutton class="form-check-form:input"
						path="${usuario.tipousuario}" name="tipousuario"
						id="inlineRadio1" value="cliente" />
				</div>
				<div class="form-check form-check-inline">
					<label class="form-check-label" for="inlineRadio1">
						Administrativo </label>
					<form:radiobutton class="form-check-form:input"
						path="${usuario.tipousuario}" name="tipousuario"
						id="inlineRadio2" value="administrativo" text="Administrativo" />
				</div>
				<div class="form-check form-check-inline">
					<label class="form-check-label" for="inlineRadio1">
						Profesional </label>
					<form:radiobutton path="${usuario.tipousuario}"
						class="form-check-form:input" name="tipousuario" id="inlineRadio3"
						value="profesional" />
				</div>
			</div>

			<!--  ELEMENTOS A MOSTRAR POR CONTEXTO DEL FORMULARIO (TIPOS DE USUARIO) -->

			<div id="cliente" style="display: none">
				<div class="form-row justify-content-center">
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="cliente.apellido">Apellido Cliente</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Uno o ambos apellidos"
							path="cliente.apellido" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03" path="cliente.tlf">Teléfono</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03"
							placeholder="Solo numeros, todo junto. Ej: 912345678"
							path="cliente.tlf" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03" path="cliente.AFP">AFP</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Ej: Modelo"
							path="cliente.AFP" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03" path="cliente.salud">Salud (Ingresar 1 o 2)</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="1: Fonasa 2: Salud"
							path="cliente.salud" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="cliente.direccion">Dirección</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Calle Ancha 123"
							path="cliente.direccion" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="cliente.comuna">Comuna</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Casablanca"
							path="cliente.comuna" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03" path="cliente.edad">Edad</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03"
							placeholder="Edad actual del cliente, en números"
							path="cliente.edad" required="required" />
					</div>
				</div>
			</div>


			<div id="administrativo" style="display: none">
				<div class="form-row justify-content-center">
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="administrativo.area">Área de Trabajo</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Ej: Recursos Humanos"
							path="administrativo.area" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="administrativo.exp">Experiencia Laboral</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Experiencia laboral en años"
							path="administrativo.exp" required="required" />
					</div>
				</div>
			</div>


			<div id="profesional" style="display: none">
				<div class="form-row justify-content-center">
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="profesional.titulo">Titulo Profesional</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Ej: Licenciado"
							path="profesional.titulo" required="required" />
					</div>
					<div class="col-md-4 mb-3">
						<form:label for="validationCustom03"
							path="profesional.ingreso">Fecha de Ingreso</form:label>
						<form:input type="text" class="form-control"
							id="validationCustom03" placeholder="Formato: DD/MM/YYYY"
							path="profesional.ingreso" required="required" />
					</div>
				</div>
			</div>

			<div class="form-row justify-content-center mt-1">
				<button class="btn btn-primary col-md-2" type="submit">Agregar</button>
			</div>

		</form:form>
	</main>

	<%@ include file="./commons/footer.jsp"%>

	<!--  SCRIPT PARA VERIFICAR OPCION DE USUARIO A INGRESAR -->
	<script src="<core:url value="/res/js/crearusuario.js"/>"></script>

</body>
</html>