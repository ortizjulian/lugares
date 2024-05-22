package com.pruebaTecnica.lugares.service;

import com.pruebaTecnica.lugares.model.Person;
import com.pruebaTecnica.lugares.repository.PersonRepository;

import com.pruebaTecnica.lugares.model.Place;
import com.pruebaTecnica.lugares.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private PersonRepository personRepository;

    public ResponseEntity<List<Place>> findAll() {

        List<Place> places = placeRepository.findAll();
        return ResponseEntity.ok(places);
    }

    public ResponseEntity<Place> save(Place place) {
        Long personId = place.getPerson().getPersonId();
        Optional<Person> optionalPerson = personRepository.findById(personId);

        if (optionalPerson.isPresent()) {
            Place savedPlace = placeRepository.save(place);
            return ResponseEntity.ok(savedPlace);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Person> getPersonVisitedPlace(Long placeId) {

        Optional<Place> optionalPlace = placeRepository.findById(placeId);

        if (optionalPlace.isPresent()) {
            Person person= optionalPlace.get().getPerson();
            return ResponseEntity.ok(person);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<List<Place>> getPlacesInCountry(String country) {
        List<Place> places = placeRepository.findByCountry(country);
        return ResponseEntity.ok(places);
    }
}

