package com.assignment3_encapsulation.assignment3;

public class Clothing extends Product{
    private int size;
    private String fabric;

    public Clothing( int productId, String productName, double price, String description, int size, String fabric) {
        super(productId, productName, price, description);
        this.size = size;
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "productId=" + getProductId() +
                ",name='" + getProductName() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                " , size=" + size +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}
