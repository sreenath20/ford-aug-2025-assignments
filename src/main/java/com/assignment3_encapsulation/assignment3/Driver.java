package com.assignment3_encapsulation.assignment3;

public class Driver {
public static void main(String[] args) {
    // Create instances of Product, Electronics, Clothing, and Groceries
    Product product = new Product(1, "notebook", 25, "Unruled notebook 160 pages");
    Electronics electronics = new Electronics(2, "Iphone", 100000, "Do not buy", 2.0);

    // Print the details of each product
    System.out.println(product);
    System.out.println(electronics);

    // Create an instance of Clothing
    Clothing clothing = new Clothing(3, "T-shirt", 500, "Cotton T-shirt", 42, "Cotton");
    Groceries groceries = new Groceries(4, "Milk", 50, "Fresh Milk","10/8/2025");
    
    System.out.println(groceries);
    System.out.println(clothing);
}
}
