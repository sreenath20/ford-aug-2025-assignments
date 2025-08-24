package com.harini.assignment3.Question3;

public class Electronics extends Products{
    String warrentyPeriod;
    public Electronics(String productName, double price, String description, int productId,String warrentyPeriod) {
        super(productName, price, description, productId);
        this.warrentyPeriod = warrentyPeriod;
    }

    @Override
    public String toString() {
        return super.toString()+", warrentyPeriod= " + warrentyPeriod + " }";
    }
}
