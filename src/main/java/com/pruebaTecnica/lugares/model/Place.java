package com.pruebaTecnica.lugares.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "lugar")

public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lugar")
    private Long placeId;

    @Column(name = "nombre")
    private String name;

    @Column(name = "departamento")
    private String department;

    @Column(name = "pais")
    private String country;

    @ManyToOne
    @JoinColumn(name = "persona_id_persona")
    private Person person;

}
