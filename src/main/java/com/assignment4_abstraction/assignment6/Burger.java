package com.assignment4_abstraction.assignment6;

public class Burger extends MenuItem implements Deliverable {
    private int tableNumber;

    public Burger(String itemName, int tableNumber) {
        super(itemName);
        this.tableNumber = tableNumber;
    }

    public void prepare() {
        System.out.println("Preparing Pizza ;" + getItemName());
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Pizza to table number: " + tableNumber);

    }
}
