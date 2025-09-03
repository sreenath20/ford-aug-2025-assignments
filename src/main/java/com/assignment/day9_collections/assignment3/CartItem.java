package com.assignment.day9_collections.assignment3;

import java.util.Objects;

public class CartItem extends Object {
    private int itemId;
    private String itemName;
    private int quantity;
    private double pricePerUnit;
    
    public CartItem() {}
    
    public CartItem(int itemId, String itemName, int quantity, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemId);
    }

    @Override
    public boolean equals(Object obj) {
        CartItem item= (CartItem) obj;
        if(item==null || this.getClass()!=item.getClass()){
            return false;
        }
        return this.itemId==item.itemId;
    }
}
