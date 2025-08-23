package com.assignment3_encapsulation.assignment5;

public class Car extends Vehicle{
    private int seatcapcity;

    public Car(String registernumber, String brand, Double rentalPrice, int seatcapcity) {
        super(registernumber, brand, rentalPrice);
        this.seatcapcity = seatcapcity;
    }

    public int getSeatcapcity() {
        return seatcapcity;
    }

    public void setSeatcapcity(int seatcapcity) {
        this.seatcapcity = seatcapcity;
    }
    public Double calculateRental(int days ) {
        return (double)500.0 * days; // Assuming a fixed rental price of 500 per day
    }

    @Override
    public String toString() {
        return "Car{" +
                "RegistrationNumber='" + getRegistrationNumber() + '\'' +
                ", brandname='" + getBrandname() + '\'' +
                ", RentalPrice=" + getRentalPrice() +
                "seatcapcity=" + seatcapcity +
                '}';
    }
}
