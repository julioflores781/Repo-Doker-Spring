package com.cursojava.curso2.persistence.crud;

import com.cursojava.curso2.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria,Integer> {

    List<Categoria> findByIdCategoria(Integer idCategoria);
}
