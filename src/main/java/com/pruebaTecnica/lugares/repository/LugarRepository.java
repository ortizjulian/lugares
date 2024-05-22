package com.pruebaTecnica.lugares.repository;

import com.pruebaTecnica.lugares.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LugarRepository extends JpaRepository<Lugar, Long> {

}

