package com.harini.day4;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(){}
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price= price;
        this.quantity = quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public String toString(){
        return "Product Details:\n"
                +"Product name: "+name+"\n"
                +"Product price: "+price+"\n"
                +"Product quantity: "+quantity;
    }
}
