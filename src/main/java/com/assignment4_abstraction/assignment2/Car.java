package com.assignment4_abstraction.assignment2;

public class Car extends Vehicle implements Repairable{
    public Car(String brand, String model) {
        super(brand,model);
    }
    public  void service() {
        System.out.println("Servicing car: "+getBrand() + " " + getModel());
    }
    public String repair() {
        return "Repairing car engine.... ";
    }

}
