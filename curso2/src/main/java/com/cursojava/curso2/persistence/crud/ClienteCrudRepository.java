package com.cursojava.curso2.persistence.crud;

import com.cursojava.curso2.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Integer> {

    List<Cliente> findById(String id);

}
