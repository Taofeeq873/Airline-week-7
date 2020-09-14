package com.sis.airline.service;


import com.sis.airline.exceptions.AgeLimitException;
import com.sis.airline.model.Passenger;

public interface IPassengerService {

    public boolean addPassenger(Passenger passenger) throws AgeLimitException;
}
