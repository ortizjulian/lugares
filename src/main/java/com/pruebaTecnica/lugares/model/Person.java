package com.pruebaTecnica.lugares.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long personId;

    @Column(name = "nombre")
    private String name ;

    @Column(name = "edad")
    private Integer age;

    @Column(name = "ocupacion")
    private String occupation;

}
