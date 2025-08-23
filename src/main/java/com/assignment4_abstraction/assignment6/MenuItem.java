package com.assignment4_abstraction.assignment6;

public abstract class MenuItem {
    private String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public abstract void prepare();
}
