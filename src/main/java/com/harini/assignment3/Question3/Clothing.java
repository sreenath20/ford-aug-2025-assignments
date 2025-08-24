package com.harini.assignment3.Question3;


public class Clothing extends Products {
    String size;
    String fabric;


    public Clothing(String productName, double price, String description, int productId,String size, String fabric) {
        super(productName, price, description, productId);
        this.size = size;
        this.fabric = fabric;
    }
    @Override
    public String toString() {
        return super.toString()+", size= " + size+ ", fabric= " + fabric+ " }";

    }
}
