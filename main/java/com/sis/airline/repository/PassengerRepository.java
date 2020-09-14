package com.sis.airline.repository;

import com.sis.airline.model.Passenger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
    Passenger findPassengerByAddress (String address);
    List<Passenger> findPassengerByPhoneGreaterThanEqual(String phone);
    Passenger findPassengerByEmail(String email);
}
