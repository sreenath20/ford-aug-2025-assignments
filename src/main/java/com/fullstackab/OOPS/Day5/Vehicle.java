package com.fullstackab.OOPS.Day5;

public abstract class Vehicle {
    String brandName;
    Double rentalPricePerDay ;

    public Vehicle() {
    }

    public Vehicle(String brandName, Double rentalPricePerDay) {
        this.brandName = brandName;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brandName);
        System.out.println("Rental Price: " + rentalPricePerDay);
    }

    abstract void start() ;

}
