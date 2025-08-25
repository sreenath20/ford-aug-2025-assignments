package com.demo.Assignment3;
//----------------Assignment 5----------------
public class Vehicle_Rental {
    public static void main(String[] args){
        Bike b1= new Bike("123xY23","hero",25.3,100,10);
        System.out.println(b1.calculate_rental());
        Car c1= new Car("123xY23","toyato",50,6,10);
        System.out.println(c1.calculate_rental());
    }


}
class vehicle{
    String Registration_number;
    String brand;
    double Rental_amount;

    public vehicle(String registration_number, String brand, double Rental_amount){
        this.Registration_number = registration_number;
        this.brand = brand;
        this.Rental_amount = Rental_amount;
    }
    int calculate_rental(){
        return (int)(Rental_amount*100.00);
    }
    int getRental_amount(){
        return (int)(Rental_amount);
    }

}
class Bike extends vehicle{
    private int EngineCapacity;
    private int noOfDays;
    public Bike(String registration_number, String brand, double Rental_amount,int EngineCapacity,int noOfDays){
        super(registration_number, brand, Rental_amount);
        this.EngineCapacity = EngineCapacity;
        this.noOfDays = noOfDays;
    }
    @Override
    int calculate_rental(){
        return noOfDays*getRental_amount();

    }


}
class Car extends vehicle{
    private int seatingCapacity;
    private int noOfDays;
    public  Car(String registration_number, String brand, double Rental_amount,int seatingCapacity,int noOfDays){
        super(registration_number, brand, Rental_amount);
        this.seatingCapacity = seatingCapacity;
        this.noOfDays = noOfDays;

    }
    @Override
    int calculate_rental(){
        return noOfDays*getRental_amount();
    }
}
