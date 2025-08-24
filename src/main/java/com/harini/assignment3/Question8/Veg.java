package com.harini.assignment3.Question8;

public class Veg extends MenuItem {
    int calories;
    String spiceLevel;

    public Veg(String name, double price, String type, int calories, String spiceLevel) {
        super(name, price, "Veg");
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Calories: " + calories);
        System.out.println("Spice Level: " + spiceLevel);
    }
}
