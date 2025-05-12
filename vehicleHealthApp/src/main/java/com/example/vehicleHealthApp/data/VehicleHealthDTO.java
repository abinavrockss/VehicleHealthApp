package com.example.vehicleHealthApp.data;




public class VehicleHealthDTO {

    private Long vehicleId;
    private double predictedHealthScore; // 0 to 1
    private boolean serviceNeeded;

    // Constructors
    public VehicleHealthDTO() {}

    public VehicleHealthDTO(Long vehicleId, double predictedHealthScore, boolean serviceNeeded) {
        this.vehicleId = vehicleId;
        this.predictedHealthScore = predictedHealthScore;
        this.serviceNeeded = serviceNeeded;
    }

    // Getters and Setters
    public Long getVehicleId() { return vehicleId; }
    public void setVehicleId(Long vehicleId) { this.vehicleId = vehicleId; }

    public double getPredictedHealthScore() { return predictedHealthScore; }
    public void setPredictedHealthScore(double predictedHealthScore) { this.predictedHealthScore = predictedHealthScore; }

    public boolean isServiceNeeded() { return serviceNeeded; }
    public void setServiceNeeded(boolean serviceNeeded) { this.serviceNeeded = serviceNeeded; }
}
