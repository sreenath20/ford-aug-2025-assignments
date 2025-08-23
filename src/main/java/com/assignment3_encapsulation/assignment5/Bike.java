package com.assignment3_encapsulation.assignment5;

public class Bike extends Vehicle  {
    private int engineecapacity;

    public Bike(String registernumber, String brand, Double rentalPrice, int engineecapacity) {
        super(registernumber, brand, rentalPrice);
        this.engineecapacity = engineecapacity;

    }

    public int getEngineecapacity() {
        return engineecapacity;
    }

    public void setEngineecapacity(int engineecapacity) {
        this.engineecapacity = engineecapacity;
    }
    public Double calculateRental(int days) {
        return (double) 300.0 * days; // Assuming a fixed rental price of 300 per day
    }

    @Override
    public String toString() {
        return "Bike{" +
                "RegistrationNumber='" + getRegistrationNumber() + '\'' +
                ", brandname='" + getBrandname() + '\'' +
                ", RentalPrice=" + getRentalPrice() +
                "engineecapacity=" + engineecapacity +
                '}';
    }
}
