package com.example.vehicleHealthApp.controller;

import com.example.vehicleHealthApp.dto.VehicleHealthDTO;
import com.example.vehicleHealthApp.service.HealthStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/health")
public class HealthController {

    @Autowired
    private HealthStatusService healthStatusService;

    @GetMapping("/vehicle/{vehicleId}")
    public ResponseEntity<List<VehicleHealthDTO>> getHealthHistory(@PathVariable Long vehicleId) {
        List<VehicleHealthDTO> history = healthStatusService.getHealthHistory(vehicleId);
        return ResponseEntity.ok(history);
    }
}
