package com.pruebaTecnica.lugares.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "ocupacion")
    private String ocupacion;

    // Constructor, getters y setters
}
