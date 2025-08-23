package com.assignment4_abstraction.assignment2;

public class Bike extends Vehicle implements Repairable{
    public  void service() {
        System.out.println("Servicing bike : "+getBrand() + " " + getModel());
    }
    public String repair() {
        return "Repairing bike brakes...... ";
    }
}
