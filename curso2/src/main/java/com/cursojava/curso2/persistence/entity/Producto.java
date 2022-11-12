package com.cursojava.curso2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto") @Getter  @Setter
    private Integer idProducto;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Getter @Setter
    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Getter @Setter
    @Column(name = "precio_venta")
    private Double precioVenta;

    @Getter @Setter
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @Getter @Setter
    private Boolean estado;


    @ManyToOne @Getter @Setter
    @JoinColumn(name = "id_categoria" , insertable = false,updatable = false)
    private Categoria categoria;




}
