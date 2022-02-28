<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-light">
	<img id="logo" src="<core:url value="/res/img/index.png"/>"
		alt="avatar">		<a class="navbar-brand" href="./">FyS</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">

		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link"
				href="./crearcapacitacion">Crear Capacitaciones</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Qué somos</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="./contacto">Contacto</a>
			</li>
		</ul>

		<!-- Example split danger button -->
		<div class="btn-group">
			<a id="login" class="btn btn-primary" href="./login" role="button"><img
				class="avatar" src="<core:url value="/res/img/avatar.png"/>"
				alt="avatar"> Login </a>
			<button type="button"
				class="btn btn-primary dropdown-toggle dropdown-toggle-split"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				<span class="sr-only">Toggle Dropdown</span>
			</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="./logout">Logout</a>
			</div>
		</div>
		
		<!--  BOTON LOGIN VIEJO -->
		<!--  <a id="login" class="btn btn-primary" href="./login" role="button">
			<img class="avatar" src="<core:url value="/res/img/avatar.png"/>"
			alt="avatar"> Login
		</a>-->

	</div>



</nav>

