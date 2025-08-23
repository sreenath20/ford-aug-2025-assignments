package Assignment3.VehicleRentalApplication;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String brand, double rentalRate, double loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }
}
