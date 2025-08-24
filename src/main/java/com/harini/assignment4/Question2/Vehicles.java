package com.harini.assignment4.Question2;

public abstract class Vehicles {
    public String brand;
    public String model;

    public Vehicles(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void service();
}
