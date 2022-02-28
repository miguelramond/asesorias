package cl.awakelab.asesorias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.asesorias.model.entity.Usuario;
import cl.awakelab.asesorias.model.entity.UsuarioSingleton;
import cl.awakelab.asesorias.model.service.UsuarioService;

/* Controlador para acceder al panel de listado de usuarios */
@Controller
public class ListarUsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	@RequestMapping(value = "/listarusuario", method = RequestMethod.GET)
	public ModelAndView mostrarListarCapacitacion() {
		
		List<UsuarioSingleton> usuario = us.getAll();
		
		return new ModelAndView("listarusuario", "usuario", usuario);
	}

}
