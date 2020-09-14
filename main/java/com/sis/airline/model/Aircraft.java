package com.sis.airline.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @NotNull
    @Column(unique = true,length = 50)
    private String registrationNumber;
    private int capacity;
    private String type;

    public Aircraft(String name, @NotNull String registrationNumber, int capacity, String type) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public Aircraft(){

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
