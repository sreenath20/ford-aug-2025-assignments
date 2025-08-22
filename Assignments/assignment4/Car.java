package com.assignments.assignment4;

public class Car extends Vehicle implements Repairable{

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing car engine...");
    }

    @Override
    public void service() {
        System.out.println("Servicing car : "+brand+" "+model);
    }

}
