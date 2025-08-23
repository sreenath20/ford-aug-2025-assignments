package Assignment3.VehicleRentalApplication;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String registrationNumber, String brand, double rentalRate, int seatingCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }
}
