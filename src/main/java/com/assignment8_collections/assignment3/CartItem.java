
package com.assignment8_collections.assignment3;

import java.util.Objects;

public class CartItem implements Comparable<CartItem> {
    private Integer itemId;
    private String itemName;
    private Integer quantity;
    private Double pricePerUnit;

    public CartItem(Integer itemId, String itemName, Integer quantity, Double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPricePerUnit() {
        return this.pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void addquantity(Integer quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void updateQuantity(Integer itemId, Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalBill() {
        return (double)this.getQuantity() * this.getPricePerUnit();
    }

    public String toString() {
        return "CartItem{itemId=" + this.itemId + ", itemName='" + this.itemName + "', quantity=" + this.quantity + ", pricePerUnit=" + this.pricePerUnit + "}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            CartItem cartItem = (CartItem)o;
            return Objects.equals(this.itemId, cartItem.itemId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.itemId});
    }

    public int compareTo(CartItem o) {
        return this.itemId.compareTo(o.itemId);
    }
}
