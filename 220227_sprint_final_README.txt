## Proyecto Grupal  ##

** SISTEMA DE ASESORIAS DE PREVENCION DE RIESGOS **

---- Link a Repo: ----

git@github.com:miguelramond/asesorias.git

---- Integrantes ----

1. Patricio Pinto
2. Andrés Pizarro
3. Miguel Ramón

---- Consideraciones ----

Se construye sobre el sistema generado en el módulo anterior. Se importan y hacen ciertas modificaciones a las clases generadas previamente.

Se une con un frontend e implementa funcionalidad para comunicarse con DB MySQl por vía de JPA.

La estructura básica del programa es:

- Un panel para crear y listar capacitaciones.
- Un sistema para registrar y ver usuarios
- Los usuarios se establecen vía una superclase 'Usuario', que tiene 3 hijos:
	- Cliente
	- Profesional
	- Administrativo
- Esta herencia se refleja también en la base de datos. Se adjunta un script para crear un espejo de la base de datos que referencia la aplicación.
- Funcionalidad de login y logout implementada con Spring security, con autenticación vía JPA al DB.
- Funcionalidad de contacto, que por el presente envía un mensaje a consola con lo ingresado.

---- TODO LIST ----
- Proyecto aun es WIP. Elementos que faltan:
	
	* Modificar y eliminar capacitaciones
	* Modificar y eliminar usuarios
	* Vista para pagos y registro de visitas.


