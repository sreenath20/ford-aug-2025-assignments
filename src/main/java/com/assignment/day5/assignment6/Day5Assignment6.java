package com.assignment.day5.assignment6;

abstract class MenuItem{
    String itemName;
    abstract void prepare();

    public MenuItem() {
    }

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }
}

interface Deliverable{
    void deliver(int tableNumber);
}

class Pizza extends MenuItem implements Deliverable {
    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    void prepare() {
        System.out.println("Preparing pizza: " + itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering pizza to table number: " + tableNumber);
    }
}

class Burger extends MenuItem implements Deliverable {
    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    void prepare() {
        System.out.println("Preparing burger: " + itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering burger to table number: " + tableNumber);
    }
}

public class Day5Assignment6 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("com.assignment.day5.assignment6.Pizza");
        Burger burger = new Burger("com.assignment.day5.assignment6.Burger");
        pizza.prepare();
        pizza.deliver(1);
        System.out.println();
        burger.prepare();
        burger.deliver(2);
    }
}
