package com.assignment.day4.assignment5;

class Vehicle{
    int registrationNumber;
    String brand;
    Double rentalRate;

    public Vehicle() {
    }

    public Vehicle(int registrationNumber, String brand, Double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public Double calculateRental(int days) {
        return rentalRate;
    }

}

class Car extends Vehicle{
    private int seatingCapacity;

    public Car(int registrationNumber, String brand, Double rentalRate, int seatingCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public Double calculateRental(int days) {
        return super.calculateRental(days) * days;
    }
}

class Bike extends Vehicle{
    private String engineCapacity;
    public Bike(int registrationNumber, String brand, Double rentalRate, String engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }
    @Override
    public Double calculateRental(int days) {
        return super.calculateRental(days) * days;
    }
}

class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int registrationNumber, String brand, Double rentalRate, int loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public Double calculateRental(int days) {
        return super.calculateRental(days) * days;
    }
}




public class Day4Assignment5 {
    public static void main(String[] args) {
        Car car = new Car(1234, "Toyota", 50.0, 5);
        Bike bike = new Bike(5678, "Yamaha", 30.0, "150cc");
        Truck truck = new Truck(9101, "Volvo", 100.0, 10000);
        int rentalDays = 3;
        System.out.println("Car Rental Cost: " + car.calculateRental(rentalDays));
        System.out.println("Bike Rental Cost: " + bike.calculateRental(rentalDays));
        System.out.println("Truck Rental Cost: " + truck.calculateRental(rentalDays));

    }
}
