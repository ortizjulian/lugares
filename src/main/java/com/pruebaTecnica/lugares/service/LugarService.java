package com.pruebaTecnica.lugares.service;

import com.pruebaTecnica.lugares.model.Persona;
import com.pruebaTecnica.lugares.repository.PersonaRepository;

import com.pruebaTecnica.lugares.model.Lugar;
import com.pruebaTecnica.lugares.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LugarService {

    @Autowired
    private LugarRepository lugarRepository;

    @Autowired
    private PersonaRepository personaRepository;

    public ResponseEntity<List<Lugar>> findAll() {

        List<Lugar> lugares = lugarRepository.findAll();
        return ResponseEntity.ok(lugares);
    }

    public ResponseEntity<Lugar> save(Lugar lugar) {
        Long idPersona = lugar.getPersona().getIdPersona();
        Optional<Persona> personaOptional = personaRepository.findById(idPersona);

        if (personaOptional.isPresent()) {
            Lugar savedLugar = lugarRepository.save(lugar);
            return ResponseEntity.ok(savedLugar);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Persona> getPersonVisitedPlace(Long lugarId) {

        Optional<Lugar> lugarOptional = lugarRepository.findById(lugarId);

        if (lugarOptional.isPresent()) {
            Persona persona = lugarOptional.get().getPersona();
            return ResponseEntity.ok(persona);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }


    }
}

