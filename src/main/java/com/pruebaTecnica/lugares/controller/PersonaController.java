package com.pruebaTecnica.lugares.controller;


import com.pruebaTecnica.lugares.model.Persona;
import com.pruebaTecnica.lugares.service.PersonaService;
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
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return personaService.findAll();
    }

    @PostMapping("/persona")
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        return personaService.save(persona);
    }
}