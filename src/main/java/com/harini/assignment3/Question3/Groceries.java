package com.harini.assignment3.Question3;

public class Groceries extends Products{
    String expiryDate;


    public Groceries(String productName, double price, String description, int productId,String expiryDate) {
        super(productName, price, description, productId);
        this.expiryDate = expiryDate;
    }
    @Override
    public String toString() {
        return super.toString()+", Expiry Date= " + expiryDate + " }";
    }
}
