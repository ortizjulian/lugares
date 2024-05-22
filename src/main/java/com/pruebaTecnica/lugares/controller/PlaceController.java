package com.pruebaTecnica.lugares.controller;

import com.pruebaTecnica.lugares.model.Place;
import com.pruebaTecnica.lugares.model.Person;
import com.pruebaTecnica.lugares.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlaceController {

    @Autowired
    private PlaceService lugarService;

    @GetMapping("/place")
    public ResponseEntity<List<Place>> getAllPlaces() {

        return lugarService.findAll();
    }

    @PostMapping("/place")
    public ResponseEntity<Place> createPlace(@RequestBody Place place) {

        return lugarService.save(place);
    }

    @GetMapping("/place/{placeId}")
    public ResponseEntity<Person> getPersonVisitedPlace(@PathVariable Long placeId) {
        return lugarService.getPersonVisitedPlace(placeId);
    }
    @GetMapping("/place/country")
    public ResponseEntity<List<Place>> getPlacesInCountry(@RequestParam String country) {
        return lugarService.getPlacesInCountry(country);
    }


}

