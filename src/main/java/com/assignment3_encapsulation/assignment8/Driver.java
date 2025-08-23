package com.assignment3_encapsulation.assignment8;

public class Driver {
    public static void main(String[] args) {
        System.out.println("*** ONLINE FOOD DELIVERY SYSTEM ***\n");

        VegItem vegItem1 = new VegItem(
            "Paneer Butter Masala",
            100,
            "Main Course",
            320,
            "Medium"
        );

        NonVegItem nonVegItem1 = new NonVegItem(
            "Chicken Biryani",
            150,
            "Main Course",
            450,
            "Spicy"
        );

        System.out.println("AVAILABLE MENU ITEMS:\n");

        vegItem1.displayItem();
        System.out.println();

        nonVegItem1.displayItem();
        System.out.println();

        Order order = new Order();

        System.out.println("CREATING ORDER:\n");

        order.addItem(vegItem1);
        order.addItem(nonVegItem1);

        System.out.println();

        order.displayOrder();

        System.out.println();

        order.displayBill();
    }
}
