package com.sis.airline.controller;

import com.sis.airline.model.Passenger;
import com.sis.airline.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;
    @RequestMapping(value = "/passengers/list", method = RequestMethod.GET)
    public String passengers(Model model){
        model.addAttribute("passengers",passengerRepository.findAll());
        /*model.addAttribute("message","Thank You For Flying With Us");*/
        return "passenger/list";
    }
    @RequestMapping(value = "/passengers/create", method = RequestMethod.GET)
    public String create(Model model){
        return "passenger/create";
    }
    @RequestMapping(value = "/passengers/add",method = RequestMethod.POST)
    public String add(Model model, @RequestParam String lastName, @RequestParam String firstName, @RequestParam String email, @RequestParam String phone, @RequestParam String address, @RequestParam int age){

        Passenger passenger = new Passenger(lastName,firstName,email,phone,address,age);
        passengerRepository.save(passenger);

        return "redirect:/passengers/list";
    }
    @RequestMapping(value = "/passengers/edit/{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        //Aircraft aircraft = aircraftRepository.findById(id);

        model.addAttribute("passenger", passengerRepository.findById(id).get());
        return "passenger/edit";
    }

    @RequestMapping(value = "/passengers/update", method = RequestMethod.POST)
    public String updatePassenger(Model model, @RequestParam int id, @RequestParam String lastName, @RequestParam String firstName, @RequestParam String email, @RequestParam String phone, @RequestParam String address,  @RequestParam int age) {

        //BeanUtils.copyProperties(aircraft, "id");

        Passenger passenger= passengerRepository.findById(id).get();
        passenger.setLastName(lastName);
        passenger.setFirstName(firstName);
        passenger.setEmail(email);
        passenger.setPhone(phone);
        passenger.setAddress(address);
        passenger.setAge(age);
        passengerRepository.save(passenger);

        return "redirect:/passengers/list";

    }

    @RequestMapping(value = "/passengers/delete/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable("id") int id, Model model) {

        Passenger passenger = passengerRepository.findById(id).get();

        passengerRepository.delete(passenger);
        return "redirect:/passengers/list";
    }

}

