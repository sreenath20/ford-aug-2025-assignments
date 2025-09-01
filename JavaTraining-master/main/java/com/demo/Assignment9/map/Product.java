package com.demo.Assignment9.map;

public class Product {
    private Integer productId;
    private String Name;
    private Double Price;

    public Product() {
    }

    public Product(Integer productId, String name, Double price) {
        this.productId = productId;
        Name = name;
        Price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }

}
