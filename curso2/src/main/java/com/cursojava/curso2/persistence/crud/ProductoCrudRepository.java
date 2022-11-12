package com.cursojava.curso2.persistence.crud;

import com.cursojava.curso2.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    List<Producto> findByIdCategoriaOrderByNombre(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock,Boolean estado);



}
