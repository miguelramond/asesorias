package cl.awakelab.asesorias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.Capacitacion;

public interface ICapacitacionRepository extends JpaRepository<Capacitacion, Integer> {

}