package com.harini.day5;

public class Bike extends Vehicle{
    public Bike(String brand, double rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");

    }
}
