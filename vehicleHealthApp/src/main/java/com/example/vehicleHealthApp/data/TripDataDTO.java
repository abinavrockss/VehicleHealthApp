package com.example.vehicleHealthApp.data;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;





public class TripDataDTO {

    private Long vehicleId;
    private double distanceTravelled;
    private double fuelUsed;
    private double averageSpeed;
    private int brakingEvents;
    private LocalDateTime timestamp;

    // Constructors
    public TripDataDTO() {}

    public TripDataDTO(Long vehicleId, double distanceTravelled, double fuelUsed,
                       double averageSpeed, int brakingEvents, LocalDateTime timestamp) {
        this.vehicleId = vehicleId;
        this.distanceTravelled = distanceTravelled;
        this.fuelUsed = fuelUsed;
        this.averageSpeed = averageSpeed;
        this.brakingEvents = brakingEvents;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public Long getVehicleId() { return vehicleId; }
    public void setVehicleId(Long vehicleId) { this.vehicleId = vehicleId; }

    public double getDistanceTravelled() { return distanceTravelled; }
    public void setDistanceTravelled(double distanceTravelled) { this.distanceTravelled = distanceTravelled; }

    public double getFuelUsed() { return fuelUsed; }
    public void setFuelUsed(double fuelUsed) { this.fuelUsed = fuelUsed; }

    public double getAverageSpeed() { return averageSpeed; }
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed; }

    public int getBrakingEvents() { return brakingEvents; }
    public void setBrakingEvents(int brakingEvents) { this.brakingEvents = brakingEvents; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
