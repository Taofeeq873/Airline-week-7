package com.sis.airline.repository;

import com.sis.airline.model.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
    Flight findFlightByFlightNumber(String flightNumber);
    List<Flight> findByTakeOffPointAndDestinationPointAndAvailableSeatGreaterThan(String t, String d, int a);
}
