package com.oops.day4;

public class Product {
    private String name;
    private String productid;
    private Double price;

    public Product() {
    }

    public Product(String name, String productid, Double price) {
        this.name = name;
        this.productid = productid;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productid='" + productid + '\'' +
                ", price=" + price +
                '}';
    }
}
