package com.pruebaTecnica.lugares.repository;

import com.pruebaTecnica.lugares.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {

}

