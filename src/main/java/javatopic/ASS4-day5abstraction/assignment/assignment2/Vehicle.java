package javatopic.day5abstraction.assignment.assignment2;

public abstract class Vehicle { // here we declare vehicle class as abstract so we cannot instantiate it
    String brand;
    Double rentalPricePerDay;

    public Vehicle(String brand, Double rentalPricePerDay) {
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public void DisplayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price: " + rentalPricePerDay);

    }
    public abstract void start(); // i do not know how to implement and
    // it can vary from obj to obj so here we leave it to the subclass why we dont use inheritance
    // but use abstraction is we can not leave an method without method in inheritance but
    // we can do it in abstraction
}
