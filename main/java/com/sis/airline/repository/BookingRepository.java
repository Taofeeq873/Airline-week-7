package com.sis.airline.repository;

import com.sis.airline.model.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
    Booking findBookingByBookingNumber(String bookingNumber);
    List<Booking> findBookingsByFlightFlightNumber(String flightNumber);
}
