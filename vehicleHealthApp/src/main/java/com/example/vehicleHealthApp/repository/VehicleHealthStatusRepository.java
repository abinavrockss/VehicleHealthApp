package com.example.vehicleHealthApp.repository;

import com.example.vehicleHealthApp.model.VehicleHealthStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface VehicleHealthStatusRepository extends JpaRepository<VehicleHealthStatus, Long> {}
