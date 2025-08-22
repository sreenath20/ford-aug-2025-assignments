package com.assignments.assignment4;

public class Bike extends Vehicle implements Repairable{

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing bike brakes...");
    }

    @Override
    public void service(){
        System.out.println("Servicing bike : "+brand+" "+model);
    }
}
