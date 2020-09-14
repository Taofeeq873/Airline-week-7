package com.sis.airline.service;

import com.sis.airline.exceptions.AgeLimitException;
import com.sis.airline.model.Passenger;
import com.sis.airline.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService implements IPassengerService {
    @Autowired
    private PassengerRepository passengerRepository;
    @Override
    public boolean addPassenger(Passenger passenger) throws AgeLimitException {
        if(passenger.getAge()<18){
            throw new AgeLimitException(String.format("Age must be above 18. Passenger %s is %d years old.", passenger.getLastName(), passenger.getAge()));
        }
        passengerRepository.save(passenger);
        return true;
    }
}
