package com.demo.product_rest_api;


public class Product {
    private Integer productId;
    private String productName;
    private Double productPrice;
    private Integer stock;

    public Product(Integer productId, String productName, Double productPrice, Integer quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stock = quantity;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", stock=" + stock +
                '}';
    }
}
