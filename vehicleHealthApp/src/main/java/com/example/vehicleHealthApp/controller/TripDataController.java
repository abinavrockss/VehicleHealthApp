package com.example.vehicleHealthApp.controller;

import com.example.vehicleHealthApp.dto.TripDataDTO;
import com.example.vehicleHealthApp.service.TripDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/trip-data")
public class TripDataController {

    @Autowired
    private TripDataService tripDataService;

    // Add a new trip
    @PostMapping
    public ResponseEntity<String> addTrip(@RequestBody @Valid TripDataDTO tripDTO) {
        tripDataService.saveTrip(tripDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Trip data saved successfully.");
    }

    // Get all trips for a vehicle
    @GetMapping("/vehicle/{vehicleId}")
    public ResponseEntity<List<TripDataDTO>> getTripsByVehicle(@PathVariable Long vehicleId) {
        List<TripDataDTO> trips = tripDataService.getTripsByVehicle(vehicleId);
        return ResponseEntity.ok(trips);
    }
}
