package cl.awakelab.asesorias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.asesorias.model.entity.Administrativo;
import cl.awakelab.asesorias.model.entity.Cliente;
import cl.awakelab.asesorias.model.entity.Profesional;
import cl.awakelab.asesorias.model.entity.Usuario;
import cl.awakelab.asesorias.model.entity.UsuarioSingleton;
import cl.awakelab.asesorias.model.repository.IAdministrativoRepository;
import cl.awakelab.asesorias.model.repository.IClienteRepository;
import cl.awakelab.asesorias.model.repository.IProfesionalRepository;
import cl.awakelab.asesorias.model.repository.IUsuarioRepository;
import cl.awakelab.asesorias.model.repository.IUsuarioSingletonRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository uRepo;
	
	@Autowired
	private IClienteRepository cRepo;
	
	@Autowired
	private IAdministrativoRepository aRepo;
	
	@Autowired
	private IProfesionalRepository pRepo;
	
	@Autowired
	private IUsuarioSingletonRepository usRepo;
	
	public UsuarioService() {
		super();
	}
	
	public List<UsuarioSingleton> getAll() {
		return usRepo.findAll();
	}
	
	public UsuarioSingleton getOne(int idusuario) {
		return usRepo.findById(idusuario).get();
	}
	
	public void create(Usuario u, Cliente c, int tipousuario) {		
		uRepo.save(u);
		
		// cRepo.save(c);
	
	}
	
	public void create(Usuario u, Administrativo a, int tipousuario) {		
		uRepo.save(u);
	
		// aRepo.save(a);
	}
	
	public void create(Usuario u, Profesional p, int tipousuario) {		
		uRepo.save(u);
		
		// pRepo.save(p);

	}
	
	public void update(Usuario u) {
		uRepo.save(u);
	}
	
	public void delete(int id) {
		uRepo.delete(uRepo.getOne(id));
	}
	
	/* Desarrollo de metodo personalizado para retornar 
	 * todos los usuarios segun su tipo */
	public List<UsuarioSingleton> getByTipousuario(Integer tipousuario){
		return usRepo.getByTipousuario(tipousuario);
		
	}
	
}
