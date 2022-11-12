package com.cursojava.curso2.controllers;

import com.cursojava.curso2.persistence.crud.ProductoCrudRepository;
import com.cursojava.curso2.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Repository
@RestController
public class ProductoController {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;


    @GetMapping(value = "productoid")
    public Optional<Producto> getId(Integer id){
        return   productoCrudRepository.findById(id);
    }

    @GetMapping(value = "productos")
    public List<Producto> getProductos(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

     @GetMapping(value = "productosIdCategoria")
    public List<Producto> getByCategoria(Integer idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombre(idCategoria);
    }

    @GetMapping(value = "productosescasos")
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    @PostMapping(value = "productosave")
    public Producto save(@RequestBody Producto producto){
        return productoCrudRepository.save(producto);
    }

    @DeleteMapping(value = "productodelete")
    public boolean delete(int idProducto){

        return getId(idProducto).map(producto -> {
            productoCrudRepository.deleteById(idProducto);
            return true;
        }).orElse(false);
    }

}
