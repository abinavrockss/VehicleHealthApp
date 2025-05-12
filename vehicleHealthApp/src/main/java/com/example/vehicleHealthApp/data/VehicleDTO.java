package com.example.vehicleHealthApp.data;



public class VehicleDTO {

    private Long id;
    private String vin;
    private String model;
    private int year;
    private String manufacturer;

    // Constructors
    public VehicleDTO() {}

    public VehicleDTO(Long id, String vin, String model, int year, String manufacturer) {
        this.id = id;
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
}
