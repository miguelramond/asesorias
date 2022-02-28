<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<title>FyS · inicio</title>
	<%@ include file="./commons/head.jsp"%>
</head>
<body id="home">

	<%@ include file="./commons/menu.jsp"%>

	<main>
		<div class="container-fluid" style="padding: 2vw 0vw 0vw 0vw;">
			<header class="row justify-content-center">
				<div class="col-sm-12">
					<h1>Felices y Seguros</h1>
				</div>
				<div class="col-sm-12">
					<h2>
						Te cuidamos a ti<i><span id="demo"></span></i>
					</h2>
				</div>
			</header>
			<div class="row justify-content-center" style="padding: 2vw 0vw 4vw 0vw;">
				<div class="card col-sm-2">
					<a href="#"> <img class="card-img-top"
						src="<core:url value="/res/img/pane/pane1.png"/>" alt="Card image cap">
						<div class="card-body">
							<p class="card-text">Visitas</p>
						</div>
					</a>
				</div>
				<div class="card col-sm-2">
					<a href="#"> <img class="card-img-top"
						src="<core:url value="/res/img/pane/pane2.png"/>" alt="Card image cap">
						<div class="card-body">
							<p class="card-text">Asesorias</p>
						</div>
					</a>
				</div>
				<div class="card col-sm-2">
					<a href="#"> <img class="card-img-top"
						src="<core:url value="/res/img/pane/pane3.png"/>" alt="Card image cap">
						<div class="card-body">
							<p class="card-text">Accidentes</p>
						</div>
					</a>
				</div>
				<div class="card col-sm-2">
					<a href="./admin"> <img class="card-img-top"
						src="<core:url value="/res/img/pane/pane4.png"/>" alt="Card image cap">
						<div class="card-body">
							<p class="card-text">Panel admin</p>
						</div>
					</a>
				</div>
			</div>
		</div>
	</main>

	<%@ include file="./commons/footer.jsp"%>
	
	<script src="<core:url value="/res/js/main.js"/>"></script>
</body>
</html>