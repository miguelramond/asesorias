package cl.awakelab.asesorias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.Administrativo;

public interface IAdministrativoRepository extends JpaRepository<Administrativo, Integer> {

}
