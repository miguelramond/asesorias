package cl.awakelab.asesorias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.asesorias.model.entity.Usuario;
import cl.awakelab.asesorias.model.entity.UsuarioSingleton;
import cl.awakelab.asesorias.model.service.UsuarioService;

/* Controlador para acceder a API con capacidades REST */
@RestController
public class RestUsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	// Path para listar todos las usuarios
	@RequestMapping(value="/api/usuario", headers = "Accept=application/json") 
	public List<UsuarioSingleton> getUsuarios(){
		
		return us.getAll();		
	}
	
	// Path para listar un usuario, busqueda por ID
	@RequestMapping(value="/api/usuario/{id}", headers = "Accept=application/json")
	public UsuarioSingleton getUsuario(@PathVariable("id") int idusuario) {
		return us.getOne(idusuario);
	}
	
	// Path para listar todos los clientes
	@RequestMapping(value="/api/cliente", headers = "Accept=application/json") 
	public List<UsuarioSingleton> getClientes(){
		
		return us.getByTipousuario(1);

	}
	// Path para listar todos los administrativos
	@RequestMapping(value="/api/admin", headers = "Accept=application/json") 
	public List<UsuarioSingleton> getAdministrativos(){
		
		return us.getByTipousuario(2);

	}
	// Path para listar todos los profesionales
	@RequestMapping(value="/api/prof", headers = "Accept=application/json") 
	public List<UsuarioSingleton> getProfesionales(){
		
		return us.getByTipousuario(3);

	}
}