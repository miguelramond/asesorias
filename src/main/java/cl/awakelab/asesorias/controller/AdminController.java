package cl.awakelab.asesorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	/* Controlador para acceder al panel de admin 
	 * (Creacion y listado de usuarios) */
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView mostrarAdmin() {
		
		return new ModelAndView("admin");
	}

}
