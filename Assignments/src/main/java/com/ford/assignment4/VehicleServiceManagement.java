package com.ford.assignment4;


// Abstract class Vehicle
abstract class Vehicle {
    String brand;
    String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method
    abstract void service();
}

// Interface Repairable
interface Repairable {
    void repair();
}

// Car class
class Car extends Vehicle implements Repairable {

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    void service() {
        System.out.println("Servicing car: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing car engine...");
    }
}

// Bike class
class Bike extends Vehicle implements Repairable {

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    void service() {
        System.out.println("Servicing bike: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing bike brakes...");
    }
}

// Main class
public class VehicleServiceManagement {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla");
        Vehicle bike = new Bike("Yamaha", "FZ");

        car.service();
        ((Repairable) car).repair();

        bike.service();
        ((Repairable) bike).repair();
    }
}
