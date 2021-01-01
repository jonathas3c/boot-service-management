package io.github.jonathas3c.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jonathas3c.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
