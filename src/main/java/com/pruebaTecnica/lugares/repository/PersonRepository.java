package com.pruebaTecnica.lugares.repository;

import com.pruebaTecnica.lugares.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}