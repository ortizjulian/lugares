package com.pruebaTecnica.lugares.service;

import com.pruebaTecnica.lugares.model.Person;
import com.pruebaTecnica.lugares.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public ResponseEntity<List<Person>> findAll() {
        List<Person> people = personRepository.findAll();
        return ResponseEntity.ok(people);
    }


    public ResponseEntity<Person> save(Person persona) {
        Person createdPerson = personRepository.save(persona);
        return ResponseEntity.ok(createdPerson);
    }
}

