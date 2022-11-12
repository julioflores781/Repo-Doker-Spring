package com.cursojava.curso2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id @Getter @Setter @Column(name = "id")
    private String id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellidos")
    private String apellidos;

    @Getter @Setter @Column(name = "celular")
    private Double celular;

    @Getter @Setter @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo_electronico") @Getter @Setter
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


}
