<form:form method="POST" action="/asesorias/crearusuario?=crear"
			modelAttribute="usuario" class="needs-validation"
			novalidate="novalidate">

			<!--  FORMULARIO BASE CON INFO DE USUARIO (SUPERCLASE) -->
			<div class="form-row justify-content-center">
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="nombre">Nombre Usuario</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Solo el primer nombre, sin apellido" path="nombre"
						required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="uname">Username</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Username único al usuario"
						path="uname" required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom03" path="psw">Contraseña</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Contraseña para ingresar al sistema." path="psw"
						required="required" />
					<div class="invalid-feedback">¡Importante saber el nombre del
						usuario!</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom04" path="fecha_nac">Fecha de nacimiento</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom04" placeholder="Formato: DD/MM/YYYY"
						path="fecha_nac" required="required" />
					<div class="invalid-feedback">Favor ingresar la fecha de
						nacimiento del usuario</div>
				</div>
				<div class="col-md-4 mb-3">
					<form:label for="validationCustom04" path="run">RUT Usuario</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom04"
						placeholder="Todo junto, solo numeros. Ej: 123456789" path="run"
						required="required" />
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
					<form:radiobutton class="form-check-form:input" path="tipousuario"
						name="tipousuario" id="inlineRadio1" value="cliente" />
				</div>
				<div class="form-check form-check-inline">
					<label class="form-check-label" for="inlineRadio1">
						Administrativo </label>
					<form:radiobutton class="form-check-form:input" path="tipousuario"
						name="tipousuario" id="inlineRadio2" value="administrativo"
						text="Administrativo" />
				</div>
				<div class="form-check form-check-inline">
					<label class="form-check-label" for="inlineRadio1">
						Profesional </label>
					<form:radiobutton path="tipousuario" class="form-check-form:input"
						name="tipousuario" id="inlineRadio3" value="profesional" />
				</div>
			</div>

			<!--  ELEMENTOS A MOSTRAR POR CONTEXTO DEL FORMULARIO (TIPOS DE USUARIO) -->

			<div id="cliente" style="display: none">
				<div class="form-row justify-content-center">
					<form:label for="validationCustom03" path="apellido">Apellido Cliente</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Uno o ambos apellidos"
						path="apellido" required="required" />
					<form:label for="validationCustom03" path="tlf">Teléfono</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Solo numeros, todo junto. Ej: 912345678" path="tlf"
						required="required" />
					<form:label for="validationCustom03" path="AFP">AFP</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Ej: Modelo" path="AFP"
						required="required" />
					<form:label for="validationCustom03" path="salud">Salud (Ingresar 1 o 2)</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="1: Fonasa 2: Salud"
						path="salud" required="required" />
					<form:label for="validationCustom03" path="direccion">Dirección</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Calle Ancha 123"
						path="direccion" required="required" />
					<form:label for="validationCustom03" path="comuna">Comuna</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03" placeholder="Casablanca" path="comuna"
						required="required" />
					<form:label for="validationCustom03" path="edad">Edad</form:label>
					<form:input type="text" class="form-control"
						id="validationCustom03"
						placeholder="Edad actual del cliente, en números" path="edad"
						required="required" />
				</div>
			</div>


			<div id="administrativo" style="display: none">
				<form:label for="validationCustom03" path="area">Área de Trabajo</form:label>
				<form:input type="text" class="form-control" id="validationCustom03"
					placeholder="Ej: Recursos Humanos" path="area" required="required" />
				<form:label for="validationCustom03" path="exp">Experiencia Laboral</form:label>
				<form:input type="text" class="form-control" id="validationCustom03"
					placeholder="Experiencia laboral en años" path="exp"
					required="required" />
			</div>


			<div id="profesional" style="display: none">
				<form:label for="validationCustom03" path="titulo">Titulo Profesional</form:label>
				<form:input type="text" class="form-control" id="validationCustom03"
					placeholder="Ej: Licenciado" path="titulo"
					required="required" />
				<form:label for="validationCustom03" path="ingreso">Fecha de Ingreso</form:label>
				<form:input type="text" class="form-control" id="validationCustom03"
					placeholder="Formato: DD/MM/YYYY" path="ingreso"
					required="required" />

			</div>

			<div class="form-row justify-content-center mt-1">
				<button class="btn btn-primary col-md-2" type="submit">Agregar</button>
			</div>

		</form:form>