package com.example.vehicleHealthApp.Entity;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Vehicle {
    @Id
    private String id;
    private String vin;
    private String model;
    private int year;
    private int fuelCapacity;
    private int lastServiceInterval;
    private int currentMileage;
    private int averageMileage;

    // Constructors, getters, and setters
}