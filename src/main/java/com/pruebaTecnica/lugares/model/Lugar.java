package com.pruebaTecnica.lugares.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "lugar")
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lugar")
    private Long idLugar;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "pais")
    private String pais;

    @ManyToOne
    @JoinColumn(name = "persona_id_persona")
    private Persona persona;

}
