package com.example.jpamappingassignment.onetoone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long id;

    private LocalDateTime createdAt;

    private int totalItems;

    private Double totalPrice;

    @OneToOne(mappedBy = "cart")
    @JsonIgnore
    private CartUser user;

    public Cart() {
    }

    public Cart(long id, LocalDateTime createdAt, int totalItems, Double totalPrice, CartUser user) {
        this.id = id;
        this.createdAt = createdAt;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CartUser getUser() {
        return user;
    }

    public void setUser(CartUser user) {
        this.user = user;
    }
}
