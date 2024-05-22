package com.pruebaTecnica.lugares.repository;

import com.pruebaTecnica.lugares.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Long> {

     List<Place> findByCountry(String country);
}

