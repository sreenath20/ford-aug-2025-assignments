package day4.vehicleService;

abstract class Vehicle {
    String brand;
    String part;
    String model;
    String color;
    Integer year;

    abstract void service(String brand,String model);


}
