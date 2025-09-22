package com.product_management.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    private Integer id;

    @NotNull(message="product name should not be null")
    @Size(min = 5, max = 100,message="product name must be min 5 and max 100 char length")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
            message = "Product name must be 6-12 characters long and contain only letters and numbers.")

    private String name;

    @Min(value=1,message="Product price must greater than 1")
    private Double price;

    @Max(value=100,message="Product size limit is 100 , no space in inventory")
    private Integer stock;

    @PastOrPresent(message = "manufacture date should be past")
    private LocalDate manufactureDate;

    @Size(min=10,max=100,message="Product description should be more detailed more than 10 char(atleast)")
    private String description;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$",
            message = "Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character.")
    private String password;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "Invalid email format.")
    private String email;
    private String category;


    public Product(Integer id, String name, Double price, Integer stock, LocalDate manufactureDate, String description, String password, String email, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.manufactureDate = manufactureDate;
        this.description = description;
        this.password = password;
        this.email = email;
        this.category = category;
    }

    public Product() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
