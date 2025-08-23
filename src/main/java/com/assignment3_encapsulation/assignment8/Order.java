package com.assignment3_encapsulation.assignment8;

public class Order {
    private MenuItem[] items;
    private int itemCount;
    private static final int MAX_ITEMS = 10;

    public Order() {
        items = new MenuItem[MAX_ITEMS];
        itemCount = 0;
    }

    public void addItem(MenuItem item) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount] = item;
            itemCount++;
            System.out.println(item.getName() + " added to order.");
        } else {
            System.out.println("Order is full! Cannot add more items.");
        }
    }

    public void displayOrder() {
        System.out.println("*** ORDER DETAILS ***");
        if (itemCount == 0) {
            System.out.println("No items in order.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item " + (i + 1) + ":");
            items[i].displayItem();
            System.out.println();
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void displayBill() {
        System.out.println("*** BILL SUMMARY ***");
        System.out.println("Total Items: " + itemCount);

        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + items[i].getName() + " - ₹" + items[i].getPrice());
        }

        System.out.println("-------------------");
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println("===================");
    }

    public int getItemCount() {
        return itemCount;
    }
}
