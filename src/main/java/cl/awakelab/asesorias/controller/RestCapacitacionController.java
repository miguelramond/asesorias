package cl.awakelab.asesorias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.asesorias.model.entity.Capacitacion;
import cl.awakelab.asesorias.model.service.CapacitacionService;

/* Controlador para acceder a API con capacidades REST */
@RestController
public class RestCapacitacionController {
	
	@Autowired
	private CapacitacionService cs;
	
	// Path para listar todas las capacitaciones
	@RequestMapping(value="/api/capacitacion", headers = "Accept=application/json") 
	public List<Capacitacion> getCapacitaciones(){
		
		return cs.getAll();		
	}
	
	// Path para listar una capacitacion, busqueda por ID
	@RequestMapping(value="/api/capacitacion/{id}", headers = "Accept=application/json")
	public Capacitacion getCapacitacion(@PathVariable("id") int id) {
		return cs.getOne(id);
	}
}