package com.pruebaTecnica.lugares.repository;

import com.pruebaTecnica.lugares.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}