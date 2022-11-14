package com.cursojava.curso2.persistence.crud;

import com.cursojava.curso2.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Integer> {

    Optional<Cliente> findById(Integer id);

}
