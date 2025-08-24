package com.harini.assignment3.Question3;

public class Products {
    private String productName;
    private double price;
    private String description;
    private int productId;

    public Products(String productName, double price, String description, int productId) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", productId=" + productId ;
    }
}
