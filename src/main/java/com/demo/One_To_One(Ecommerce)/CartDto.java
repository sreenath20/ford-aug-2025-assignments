package com.abc.app.Ecommerce;

import java.time.LocalDateTime;

public class CartDto {
    private LocalDateTime createdAt;
    private Integer totalItems;
    private Double  totalPrice;

    public CartDto() {
    }

    public CartDto(LocalDateTime createdAt, Integer totalItems, Double totalPrice) {
        this.createdAt = createdAt;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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
}
