package com.assignments.assignment9;

import java.util.Objects;

public class Product implements Comparable<Product>{
    Integer id;
    String name;
    Double price;

    public Product(){}
    public Product(Integer id){
        this.id = id;
        name = "";
        price = 0.0;
    }
    public Product(Integer id, String name, Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }
}
