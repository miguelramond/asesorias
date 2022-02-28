package cl.awakelab.asesorias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.asesorias.model.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
