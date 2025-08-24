package com.harini.assignment3.Question5;

public class Truck extends Vehicle{
    int loadCapacity;
    public Truck(int registrationNumber, String brand, double rentalRate, int loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        super.calculateRent(days);
        if(loadCapacity>1000){
            rent+=600;
        }
        return rent;
    }
}
