package com.assignment3_encapsulation.assignment5;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car("1234", "ford", 500.0, 5);
        System.out.println(car.toString());
        System.out.println("Rental Price for 3 days: " + car.calculateRental(3));
        Bike bike = new Bike("56789", "Yamaha", 300.0, 150);
        System.out.println(bike.toString());
        System.out.println("Rental Price for 3 days: " + bike.calculateRental(3));
        Truck truck = new Truck("98765", "Volvo", 1000.0, 10000);
        System.out.println(truck.toString());
        System.out.println("Rental Price for 3 days: " + truck.calculateRental(3));
    }
}
