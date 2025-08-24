package com.harini.assignment4.Question2;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("Ford","Endeaver");
        Bike bike= new Bike("Yamaha","FZ");
        car.service();
        car.repair("engine");
        bike.service();
        bike.repair("brake");
    }
}
