package com.harini.day5;

public class Car extends Vehicle{

    public Car(String brand, double rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }

}
