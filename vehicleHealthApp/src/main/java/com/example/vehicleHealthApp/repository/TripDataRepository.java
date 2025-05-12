package com.example.vehicleHealthApp.repository;

import com.example.vehicleHealthApp.model.TripData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface TripDataRepository extends JpaRepository<TripData, Long> {
    List<TripData> findByVehicleId(Long vehicleId);
}