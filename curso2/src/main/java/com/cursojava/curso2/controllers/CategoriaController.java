package com.cursojava.curso2.controllers;

import com.cursojava.curso2.persistence.crud.CategoriaCrudRepository;
import com.cursojava.curso2.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @RequestMapping(value = "categorias")
    public List<Categoria> getCategorias(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    @RequestMapping(value = "categoriaid")
    public List<Categoria> getIdCategoria(Integer idCategoria){
        return categoriaCrudRepository.findByIdCategoria(idCategoria);
    }

}
