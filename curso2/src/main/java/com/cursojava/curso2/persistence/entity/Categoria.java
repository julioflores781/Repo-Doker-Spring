package com.cursojava.curso2.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") @Getter @Setter
    private Integer idCategoria;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "estado")
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;


}
