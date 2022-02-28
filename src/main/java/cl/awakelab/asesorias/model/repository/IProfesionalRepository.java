package cl.awakelab.asesorias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.Profesional;

public interface IProfesionalRepository extends JpaRepository<Profesional, Integer> {

}
