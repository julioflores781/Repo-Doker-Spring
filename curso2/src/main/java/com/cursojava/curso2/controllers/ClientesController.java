package com.cursojava.curso2.controllers;


import com.cursojava.curso2.persistence.crud.ClienteCrudRepository;
import com.cursojava.curso2.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientesController {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;



    @GetMapping(value = "clientesId")
    public Optional<Cliente> getIdClientes(Integer id) {
        return clienteCrudRepository.findById( id );
    }

    @GetMapping(value = "clientes")
    public List<Cliente> getAll(){

        return (List<Cliente>) clienteCrudRepository.findAll();
    }


}
