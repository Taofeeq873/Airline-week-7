package com.sis.airline.repository;

import com.sis.airline.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AircraftRepository extends CrudRepository<Aircraft, Integer> {
    Aircraft findAircraftByName(String name);
    List<Aircraft> findAircraftByCapacityGreaterThanEqual(int capacity);
    Aircraft findAircraftByRegistrationNumber(String registrationNumber);
}
