package com.assignment3_encapsulation.assignment3;

public class Electronics extends Product {
    private double warrantyPeriod;

    public Electronics(int productid, String productname , double price,String discription , double  warrantyPeriod) {
        super(productid, productname, price, discription);
        this.warrantyPeriod = warrantyPeriod;

    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "productId=" + getProductId() +
                ", productName='" + getProductName() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                "warrantyPeriod=" + warrantyPeriod +
                '}';
    }
}
