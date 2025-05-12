package com.example.vehicleHealthApp.repository;

import com.example.vehicleHealthApp.model.Vehicle;
import com.example.vehicleHealthApp.model.TripData;
import com.example.vehicleHealthApp.model.VehicleHealthStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}



