package com.assignments.assignment4;

public class Burger extends Pizza implements Deliverable{
    public Burger(String itemName) {
        super(itemName);
    }
    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Burger to table "+tableNumber);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger : "+itemName);
    }
}
