package javatopic.day5abstraction.assignment.assignment2;

public class Bike extends Vehicle {
    public Bike(String brand, Double rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }
    @Override
    public void start(){
        System.out.println("Bike starting by push button");
    }
}
