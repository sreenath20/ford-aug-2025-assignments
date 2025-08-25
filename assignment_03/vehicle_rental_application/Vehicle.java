package assignment_03.vehicle_rental_application;

class Vehicle {
    private String registrationNumber;
    private String brand;
    private double rentalRate;

    public Vehicle(String registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double calculateRental(int days) {
        return rentalRate * days;
    }

    public void displayVehicleInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Daily Rental Rate: Rs." + rentalRate);
    }
}
