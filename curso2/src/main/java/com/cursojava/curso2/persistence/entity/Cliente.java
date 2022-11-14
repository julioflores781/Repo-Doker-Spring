package com.cursojava.curso2.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id @Getter @Setter @Column(name = "codigo_cliente")
    private Integer id;

    @Getter @Setter @Column(name = "codigo_sexo")
    private Integer codigoSexo;

    @Getter @Setter @Column(name = "codigo_ecivil")
    private Integer codigoCivil;

    @Getter @Setter
    private String apellido1;

     @Getter @Setter
    private String apellido2;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String codigo1;

    @Getter @Setter
    private String codigo2;

    @Getter @Setter
    private String codigo3;

    @Getter @Setter
    private String codigo4;

    @Getter @Setter @Column(name = "nac_fecha")
    private Date nacFecha;


    @Getter @Setter @Column(name = "telefono1")
    private String celular;

    @Getter @Setter @Column(name = "dom_direccion")
    private String direccion;

    @Getter @Setter @Column(name = "paciente_sn")
    private int activo;

    @Getter @Setter @Column(name = "tipo_dni_pk")
    private Integer tipoDocumento;

    @Getter @Setter @Column(name = "vip_sn")
    private int vip;

    @Getter @Setter @Column(name = "observ_vip")
    private String observVip;


    @Getter @Setter @Column(name = "email")
    private String correoElectronico;






}
