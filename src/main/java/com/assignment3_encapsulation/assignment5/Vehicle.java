package com.assignment3_encapsulation.assignment5;

public class Vehicle {
    private String RegistrationNumber;
    private String brandname;
    private Double RentalPrice;

    public Vehicle(String r, String b, Double R) {
        this.RegistrationNumber = r;
        this.brandname = b;
        this.RentalPrice = R;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Double getRentalPrice() {
        return RentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        RentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "RegistrationNumber='" + RegistrationNumber + '\'' +
                ", brandname='" + brandname + '\'' +
                ", RentalPrice=" + RentalPrice +
                '}';
    }
}
