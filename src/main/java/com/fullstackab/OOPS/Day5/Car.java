package com.fullstackab.OOPS.Day5;

public class Car extends Vehicle {
    public Car(String brandName, double rentalPricePerDay) {
        super(brandName, rentalPricePerDay);
    }

    public void start (){
        System.out.println("Car is starting with Key Ignition");
    }
}
