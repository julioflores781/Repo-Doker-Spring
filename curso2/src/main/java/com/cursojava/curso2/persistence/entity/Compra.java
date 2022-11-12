package com.cursojava.curso2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra") @Getter  @Setter
    private Integer idCompra;

    @Getter @Setter
    @Column(name = "id_cliente")
    private String idCliente;



    @Getter @Setter
    private LocalDateTime fecha;

    @Getter @Setter
    @Column(name = "medio_pago")
    private String medioPago;


    @Getter @Setter
    private String  comentario;

    @Getter @Setter
    private String estado;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;


    @ManyToOne
    @JoinColumn(name = "id_cliente" , insertable = false,updatable = false)
    private Cliente cliente;



}
