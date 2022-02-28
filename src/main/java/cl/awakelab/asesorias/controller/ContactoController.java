package cl.awakelab.asesorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactoController {
	
	/* Controlador para acceder a planilla de contacto */
	
	@RequestMapping(value = "/contacto", method = RequestMethod.GET)
	public ModelAndView mostrarContacto() {
		
		return new ModelAndView("contacto");
	}

}

