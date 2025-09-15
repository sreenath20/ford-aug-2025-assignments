package com.demo.product.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

@Entity
public class Product {

    @Id
    private Integer id;

    @NotBlank(message = "Name should not be blank or null.")
    private String name;

    @NotNull(message = "Category should not be null.")
    private String category;

    @Min(1)
    private Double price;

    @Min(0)
    private Integer stock;

    @NotNull
    private LocalDate manufactureDate;

    @NotNull
    private LocalDate expirationDate;

    public Product() {}

    public Product(Integer id, String name, String category ,Double price, Integer stock, LocalDate manufactureDate,  LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", manufactureDate=" + manufactureDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
