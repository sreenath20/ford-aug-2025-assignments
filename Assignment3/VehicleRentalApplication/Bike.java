package Assignment3.VehicleRentalApplication;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String registrationNumber, String brand, double rentalRate, int engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }
}
