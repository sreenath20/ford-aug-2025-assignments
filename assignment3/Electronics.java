package com.assignments.assignment3;

public class Electronics extends Product{

    private int warrantyPeriod;

    public Electronics(long productId, String productName, double price, String description,int warrantyPeriod) {
        super(productId, productName, price, description);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics");
        super.displayDetails();
        System.out.println("Warranty Period (in years) : " + warrantyPeriod);
    }
}
