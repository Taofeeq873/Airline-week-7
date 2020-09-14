package com.sis.airline;

import com.sis.airline.model.Aircraft;
import com.sis.airline.model.Passenger;
import com.sis.airline.repository.AircraftRepository;
import com.sis.airline.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineApplication  /*implements CommandLineRunner*/{

    @Autowired
    /*private AircraftRepository aircraftRepository;*/
    private PassengerRepository passengerRepository;
    public static void main(String[] args) {
        SpringApplication.run(AirlineApplication.class, args);
    }

   /* @Override
    public void run(String...args) throws Exception{
        if (aircraftRepository.findAircraftByRegistrationNumber("ABC1234")==null){
            Aircraft aircraft = new Aircraft("Sirs","ABC1234",50,"BOEING");
            aircraftRepository.save(aircraft);
        }
    }*/
   /* @Override
    public void run(String...args) throws Exception{
        if (passengerRepository.findPassengerByEmail("azeez12@gmail.com")==null){
            Passenger passenger = new Passenger("Azeez","Taofeeq","azeez12@gmail.com","080231456","12,azeez street",21);
            passengerRepository.save(passenger);
        }
    }*/

}

