package com.harini.assignment3.Question9;

public class Main {
    public static void main(String[] args) {
        Policy p1 = new LifeInsurance("L101", "John", 50000, "Jane");
        Policy p2 = new HealthInsurance("H202", "Alice", 40000, "City Hospital");
        Policy p3 = new VehicleInsurance("V303", "Bob", 30000, "Car: Sedan");
        System.out.println("Life Insurance Premium: " + p1.calculatePremium());
        System.out.println("Health Insurance Premium: " + p2.calculatePremium());
        System.out.println("Vehicle Insurance Premium: " + p3.calculatePremium());
    }
}
