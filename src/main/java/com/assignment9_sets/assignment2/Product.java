
package com.assignment9_sets.assignment2;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private Integer productId;
    private String name;
    private Double price;

    public Product(Integer productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Product{productId=" + this.productId + ", name='" + this.name + "', price=" + this.price + "}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Product product = (Product)o;
            return Objects.equals(this.price, product.price);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.price);
    }

    public int compareTo(Product o) {
        return this.price.compareTo(o.price);
    }
}
