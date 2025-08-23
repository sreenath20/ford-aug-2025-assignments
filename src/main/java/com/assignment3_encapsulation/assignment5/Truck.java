package com.assignment3_encapsulation.assignment5;

public class Truck extends Vehicle {

    private int loadCapacity;

    public Truck(String registrationNumber, String brandName, Double rentalPrice, int loadCapacity) {
        super(registrationNumber, brandName, rentalPrice);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Double calculateRental(int days) {
        return (double) 1000.0 * days; // Assuming a fixed rental price of 1000 per day
    }

    @Override
    public String toString() {
        return "Truck{" +
                "RegistrationNumber='" + getRegistrationNumber() + '\'' +
                ", brandName='" + getBrandname() + '\'' +
                ", RentalPrice=" + getRentalPrice() +
                ", LoadCapacity=" + loadCapacity +
                '}';
    }
}
