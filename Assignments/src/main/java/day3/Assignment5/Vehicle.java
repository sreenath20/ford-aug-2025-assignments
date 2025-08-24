package day3.Assignment5;

public class Vehicle {
    int registrationNumber;
    String brand;
    double rentalRate;
    double rent;

    public Vehicle(int registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }
    public double calculateRent(int days){
        rent = rentalRate * days;
        return rent;
    }
}
