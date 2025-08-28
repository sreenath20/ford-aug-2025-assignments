package com.assignment.day5.assignment2;

abstract class Vehicle{
    String brand;
    String model;
    public abstract void service();

    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

interface Repairable{
    void repair();
}

class Car extends Vehicle implements Repairable {

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void service() {
        System.out.println("Servicing com.assignment.day5.assignment2.Car: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing com.assignment.day5.assignment2.Car Engine");
    }
}

class Bike extends Vehicle implements Repairable {

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void service() {
        System.out.println("Servicing com.assignment.day5.assignment2.Bike: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing com.assignment.day5.assignment2.Bike brakes");
    }
}

public class Day5Assignment2 {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry");
        car.service();
        car.repair();
        System.out.println();
        Bike bike = new Bike("Yamaha", "FZ");
        bike.service();
        bike.repair();


    }

}
