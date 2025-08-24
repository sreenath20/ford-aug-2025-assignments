package com.harini.day5;

public abstract class Vehicle {
    public String brand;
    public double rentalPricePerDay;
    public Vehicle(String brand, double rentalPricePerDay) {
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price: " + rentalPricePerDay);

    }
    public abstract void start();
}
