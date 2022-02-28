package cl.awakelab.asesorias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	// Método personalizado para tomar un usuario según su tipo
	List<Usuario> getByTipousuario(Integer tipousuario);
	
} 