package cl.awakelab.asesorias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.asesorias.model.entity.Capacitacion;
import cl.awakelab.asesorias.model.service.CapacitacionService;

/* Controlador para acceder al panel de creacion de capacitaciones 
 * (Creacion y listado de capacitaciones) */

@Controller
public class CrearCapacitacionController {
	
	@Autowired
	private CapacitacionService cs;
	
	// Metodo GET que llama a formulario en blanco
	@RequestMapping(value = "/crearcapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarCrearCapacitacionGET() {
		
		return new ModelAndView("crearcapacitacion", "capacitacion", new Capacitacion());
	}
	
	// Metodo POST para agregar una capacitacion a DB
	@RequestMapping(value = "/crearcapacitacion", method = RequestMethod.POST)
		
	    public ModelAndView submit(@ModelAttribute("capacitacion")Capacitacion capacitacion, 
	    	      BindingResult result, ModelMap model) {
					// Tomar datos segun campos de formularios mapeados
	    	        model.addAttribute("rutcliente", capacitacion.getrutcliente());
	    	        model.addAttribute("dia", capacitacion.getDia());
	    	        model.addAttribute("hora", capacitacion.getHora());
	    	        model.addAttribute("lugar", capacitacion.getLugar());
	    	        model.addAttribute("duracion", capacitacion.getDuracion());
	    	        model.addAttribute("qty", capacitacion.getQty());
	    	        
	    	        // Llamar a servicio para crear nuevo registro en base de dato
	    	        cs.create(capacitacion);
	    	        
	    	        return new ModelAndView("redirect:/listarcapacitacion");
	    	    }
	    
}
