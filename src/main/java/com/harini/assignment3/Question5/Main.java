package com.harini.assignment3.Question5;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(1234,"Ford",15,8);
        Vehicle bike = new Bike(2345,"Honda",13,250);
        Vehicle truck = new Truck(3456,"Ford",25,2000);
        System.out.println("The rental price for the car for 10 days is "+ car.calculateRent(10));
        System.out.println("The rental price for the bike for 10 days is "+ bike.calculateRent(10));
        System.out.println("The rental price for the truck for 10 days is "+ truck.calculateRent(10));
    }
}
