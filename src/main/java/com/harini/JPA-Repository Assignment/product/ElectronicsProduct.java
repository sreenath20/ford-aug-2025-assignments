package com.abc.app.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDate;

@Entity // Entity annotation says that this Product is being mapped to a table named Product
public class ElectronicsProduct {
    @Id
    private Integer id;

    @NotNull(message = "Product name must not be null")
    @Size(min=5, max = 100, message = "product name must be min of 5 and max of 100")
    private String name;
    @Min(value = 1, message = "product price must be greater than 0.")
    private Double price;
    private Integer stock;
    private LocalDate manufacturing_date;
    private String description;

    public ElectronicsProduct() {}

    public ElectronicsProduct(Integer id, String name, Double price, Integer stock, LocalDate manufacturing_date,String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.manufacturing_date = manufacturing_date;
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

    public LocalDate getManufacturing_date() {
        return manufacturing_date;
    }

    public void setManufacturing_date(LocalDate manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
