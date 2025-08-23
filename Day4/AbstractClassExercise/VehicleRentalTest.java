abstract class Vehicle {
    String brand;
    int rentalPricePerDay;

    Vehicle(String brand, int rentalPricePerDay) {
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price Per Day: " + rentalPricePerDay);
    }

    abstract void start();
}

class Car extends Vehicle {
    Car(String brand, int rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }
}

class Bike extends Vehicle {
    Bike(String brand, int rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    void start() {
        System.out.println("Bike is starting with a self-start button...");
    }
}

public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2000);
        Vehicle bike = new Bike("Yamaha", 800);

        System.out.println("--- Car Details ---");
        car.displayDetails();
        car.start();

        System.out.println("\n--- Bike Details ---");
        bike.displayDetails();
        bike.start();
    }
}
