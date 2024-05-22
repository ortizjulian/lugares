package com.pruebaTecnica.lugares.controller;

import com.pruebaTecnica.lugares.model.Lugar;
import com.pruebaTecnica.lugares.model.Persona;
import com.pruebaTecnica.lugares.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LugarController {

    @Autowired
    private LugarService lugarService;

    @GetMapping("/lugar")
    public ResponseEntity<List<Lugar>> getAllPlaces() {

        return lugarService.findAll();
    }

    @PostMapping("/lugar")
    public ResponseEntity<Lugar> createPlace(@RequestBody Lugar lugar) {

        return lugarService.save(lugar);
    }

    @GetMapping("/lugar/{lugarId}")
    public ResponseEntity<Persona> getPersonVisitedPlace(@PathVariable Long lugarId) {
        return lugarService.getPersonVisitedPlace(lugarId);
    }
}

