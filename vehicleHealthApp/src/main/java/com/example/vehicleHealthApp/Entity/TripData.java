package com.example.vehicleHealthApp.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;

@Entity
public class TripData {
    @Id @GeneratedValue
    private Long id;

    private double distanceTravelled;
    private double fuelUsed;
    private double averageSpeed;
    private double brakingEvents;

    @ManyToOne
    private Vehicle vehicle;
}
