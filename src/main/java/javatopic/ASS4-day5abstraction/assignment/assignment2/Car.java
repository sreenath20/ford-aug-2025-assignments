package javatopic.day5abstraction.assignment.assignment2;

public class Car extends Vehicle {
    public Car(String brand, Double rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }
    @Override
    public void start(){
        System.out.println("Car starting is igniting key");
    }
}
