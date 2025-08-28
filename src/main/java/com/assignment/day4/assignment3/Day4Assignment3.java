package com.assignment.day4.assignment3;

class Product{
    private int productId;
    private String name;
    private Double price;
    private String description;

    public Product() {
    }

    public Product(int productId, String name, Double price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


class Electronics extends Product{
    private String warrantyPeriod;

    public Electronics() {}

    public Electronics(int productId, String name, Double price, String warrantyPeriod) {
        super(productId, name, price, "Electronics Item");
        this.warrantyPeriod = warrantyPeriod;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Warranty Period: " + warrantyPeriod);
    }

}

class Clothing extends Product{
    private String size;
    private String fabricType;

    public Clothing() {}

    public Clothing(int productId, String name, Double price, String size, String fabricType) {
        super(productId, name, price, "Clothing Item");
        this.size = size;
        this.fabricType = fabricType;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
        System.out.println("Fabric Type: " + fabricType);
    }
}

class Grocery extends Product {
    private String expiryDate;

    public Grocery() {
    }

    public Grocery(int productId, String name, Double price, String expiryDate) {
        super(productId, name, price, "Grocery Item");
        this.expiryDate = expiryDate;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class Day4Assignment3 {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(101, "Laptop", 75000.0, "2 years");
        laptop.displayDetails();
        System.out.println();
        Clothing shirt = new Clothing(102, "Shirt", 1500.0, "L", "Cotton");
        shirt.displayDetails();
        System.out.println();
        Grocery milk = new Grocery(103, "Milk", 50.0, "2023-12-31");
        milk.displayDetails();
        System.out.println();
    }
}
