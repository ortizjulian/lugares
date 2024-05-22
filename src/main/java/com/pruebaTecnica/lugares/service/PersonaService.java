package com.pruebaTecnica.lugares.service;

import com.pruebaTecnica.lugares.model.Persona;
import com.pruebaTecnica.lugares.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> people = personaRepository.findAll();
        return ResponseEntity.ok(people);
    }


    public ResponseEntity<Persona> save(Persona persona) {
        Persona createdPerson = personaRepository.save(persona);
        return ResponseEntity.ok(createdPerson);
    }
}

