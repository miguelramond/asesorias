package cl.awakelab.asesorias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.asesorias.model.entity.Capacitacion;
import cl.awakelab.asesorias.model.service.CapacitacionService;

/* Controlador para acceder al panel de listado de capacitaciones */
@Controller
public class ListarCapacitacionController {
	
	@Autowired
	private CapacitacionService cs;
	
	@RequestMapping(value = "/listarcapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarListarCapacitacion() {
		
		List<Capacitacion> capacitacion = cs.getAll();
		
		return new ModelAndView("listarcapacitacion", "capacitacion", capacitacion);
	}

}
