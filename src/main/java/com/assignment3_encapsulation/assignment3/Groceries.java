package com.assignment3_encapsulation.assignment3;

public class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productd, String name, double price, String description,String expirydate) {
        super(productd, name, price, description);
        this.expiryDate = expirydate;

    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                ", productId=" + getProductId() +
                ", product name=" + getProductName() +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                "expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
