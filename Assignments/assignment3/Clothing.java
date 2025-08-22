package com.assignments.assignment3;

public class Clothing extends Product {

    private int size;
    private String fabric;

    public Clothing(long productId, String productName, double price, String description, int size, String fabric) {
        super(productId, productName, price, description);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing");
        super.displayDetails();
        System.out.println("Clothing Size: " + size);
        System.out.println("Clothing Fabric: " + fabric);
    }
}
