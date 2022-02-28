package cl.awakelab.asesorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/* Controlador para acceder a la página de inicio) */
@Controller
public class InicioController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView mostrarInicio() {
		
		return new ModelAndView("inicio");
	}

}
