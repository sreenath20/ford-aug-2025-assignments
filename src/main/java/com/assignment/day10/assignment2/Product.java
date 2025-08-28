package com.assignment.day10.assignment2;

public class Product implements Comparable<Product>{
    int productid;
    String name;
    double price;

    public Product(int productid, String name, double price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
    }
    public Product() {}

    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.productid,p.productid);
    }


}
