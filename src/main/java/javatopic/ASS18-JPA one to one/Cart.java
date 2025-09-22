package com.e_commerce.onlinemart;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.LocalDate;
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate createdAt;
    private Integer totalItems;
    private Double totalPrice;

    @OneToOne(mappedBy="cart")
    private Users user;

    public Cart() {
    }

    public Cart(Long id, LocalDate createdAt, Integer totalItems, Double totalPrice, Users user) {
        this.id = id;
        this.createdAt = createdAt;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
