package cl.awakelab.asesorias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.UsuarioSingleton;

public interface IUsuarioSingletonRepository extends JpaRepository<UsuarioSingleton, Integer> {

	// Método personalizado para tomar un usuario según su tipo
	List<UsuarioSingleton> getByTipousuario(Integer tipousuario);
	
}
