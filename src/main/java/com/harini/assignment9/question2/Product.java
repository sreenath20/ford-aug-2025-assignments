package com.harini.assignment9.question2;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;
    private Integer id;
    public Product(String name, Double price, Integer id) {
        this.name = name;
        this.price = price;
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
