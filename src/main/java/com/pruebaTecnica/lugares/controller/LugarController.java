package com.pruebaTecnica.lugares.controller;

import com.pruebaTecnica.lugares.model.Lugar;
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
    public ResponseEntity<List<Lugar>> getAllLugares() {

        return lugarService.findAll();
    }

    @PostMapping("/lugar")
    public ResponseEntity<Lugar> createLugar(@RequestBody Lugar lugar) {

        return lugarService.save(lugar);
    }
}

