package com.example.vehicleHealthApp.controller;

import com.example.vehicleHealthApp.dto.VehicleDTO;
import com.example.vehicleHealthApp.dto.VehicleHealthDTO;
import com.example.vehicleHealthApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;



@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // Add a new vehicle
    @PostMapping
    public ResponseEntity<VehicleDTO> createVehicle(@RequestBody @Valid VehicleDTO vehicleDTO) {
        VehicleDTO createdVehicle = vehicleService.addVehicle(vehicleDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVehicle);
    }

    // Get a specific vehicle
    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getVehicle(@PathVariable Long id) {
        VehicleDTO vehicle = vehicleService.getVehicleById(id);
        return ResponseEntity.ok(vehicle);
    }

    // Get vehicle health prediction
    @GetMapping("/{id}/health")
    public ResponseEntity<VehicleHealthDTO> getVehicleHealth(@PathVariable Long id) {
        VehicleHealthDTO healthDTO = vehicleService.evaluateHealth(id);
        return ResponseEntity.ok(healthDTO);
    }
}
