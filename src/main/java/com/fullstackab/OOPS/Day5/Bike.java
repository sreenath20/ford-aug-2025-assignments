package com.fullstackab.OOPS.Day5;

public class Bike extends Vehicle{
    public Bike(String brandName, double rentalPricePerDay) {
        super(brandName, rentalPricePerDay);
    }
    public void start (){
        System.out.println("Bike is starting with self-start button");
    }
}
