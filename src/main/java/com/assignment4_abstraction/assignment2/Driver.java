package com.assignment4_abstraction.assignment2;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.service();
        System.out.println(car.repair());
        Bike bike = new Bike();
        bike.setBrand("Yamaha");
        bike.setModel("FZ");
        bike.service();
        System.out.println(bike.repair());
    }
}
