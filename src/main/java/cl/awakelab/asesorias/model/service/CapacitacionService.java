package cl.awakelab.asesorias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.asesorias.model.entity.Capacitacion;
import cl.awakelab.asesorias.model.repository.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository cRepo;
	
	public CapacitacionService() {
		super();
	}
	
	public List<Capacitacion> getAll() {
		return cRepo.findAll();
	}
	
	public Capacitacion getOne(int id) {
		//return cRepo.getOne(id);
		return cRepo.findById(id).get();
	}
	
	public void create(Capacitacion c) {
		cRepo.save(c);
	}
	
	public void update(Capacitacion c) {
		cRepo.save(c);
	}
	
	public void delete(int id) {
		cRepo.delete(cRepo.getOne(id));
	}
	
}
