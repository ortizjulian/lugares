package com.pruebaTecnica.lugares.controller;


import com.pruebaTecnica.lugares.model.Person;
import com.pruebaTecnica.lugares.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personaService;

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAll() {
        return personaService.findAll();
    }

    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return personaService.save(person);
    }
}