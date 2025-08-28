package com.assignment.day4.assignment8;

import java.awt.*;

class MenuItem{
    private String name;
    private double price;
    private String type;

    public MenuItem() {
    }

    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class VegItem extends MenuItem{
    private int calories;
    private String spiceLevel;

    public VegItem(String name, double price, String type, int calories, String spiceLevel) {
        super(name, price, type);
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    public void displayMenu() {
        System.out.println("Veg Item: " + getName() + ", Price: " + getPrice() + ", Type: " + getType() +
                           ", Calories: " + calories + ", Spice Level: " + spiceLevel);
    }

}

class NonVegItem extends MenuItem{
    private int calories;
    private String meatType;

    public NonVegItem(String name, double price, String type, int calories, String meatType) {
        super(name, price, type);
        this.calories = calories;
        this.meatType = meatType;
    }

    public void displayMenu() {
        System.out.println("Non-Veg Item: " + getName() + ", Price: " + getPrice() + ", Type: " + getType() +
                           ", Calories: " + calories + ", Meat Type: " + meatType);
    }
}

class Order{
    private MenuItem[] items;
    private int itemCount;

    public Order(int size) {
        items = new MenuItem[size];
        itemCount = 0;
    }

    public void addItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Order is full, cannot add more items.");
        }
    }

    public void displayOrder() {

        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof VegItem) {
                ((VegItem) items[i]).displayMenu();
            } else if (items[i] instanceof NonVegItem) {
                ((NonVegItem) items[i]).displayMenu();
            } else {
                System.out.println("Unknown item type.");
            }
        }

        Double totalprice = 0.0;
        System.out.println("Order Details:");
        for (int i = 0; i < itemCount; i++) {
            totalprice += items[i].getPrice();
        }
        System.out.println("Total Bill: " + totalprice);
    }
}

public class Day4Assignment8 {
    public static void main(String[] args) {
        MenuItem vegItem1 = new VegItem("Veg Burger", 5.99, "Burger", 300, "Medium");
        MenuItem vegItem2 = new VegItem("Veg Pizza", 8.99, "Pizza", 400, "High");
        MenuItem nonVegItem1 = new NonVegItem("Chicken Burger", 7.99, "Burger", 500, "Chicken");
        MenuItem nonVegItem2 = new NonVegItem("Pepperoni Pizza", 10.99, "Pizza", 600, "Pork");
        Order order = new Order(10);
        order.addItem(vegItem1);
        order.addItem(vegItem2);
        order.addItem(nonVegItem1);
        order.addItem(nonVegItem2);
        order.displayOrder();

    }
}
