package com.assignment3_encapsulation.assignment8;

public class NonVegItem extends MenuItem {
    private int calories;
    private String spiceLevel;

    public NonVegItem(String name, double price, String type, int calories, String spiceLevel) {
        super(name, price, type);
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    public int getCalories() {
        return calories;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayItem() {
        System.out.println("=== NON-VEG ITEM ===");
        System.out.println("Name: " + getName());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Type: " + getType());
        System.out.println("Calories: " + calories);
        System.out.println("Spice Level: " + spiceLevel);
        System.out.println("====================");
    }
}
