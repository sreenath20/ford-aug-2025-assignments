package com.harini.assignment3.Question8;

public class MenuItem {
    String name;
    double price;
    String type;

    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }
}
