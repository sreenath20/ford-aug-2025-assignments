package Assignment3.VehicleRentalApplication;

public class Vehicle {
    private String registrationNumber;
    private String brand;
    private double rentalRate;

    public Vehicle(String registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public double calculateRental(int days) {
        return rentalRate * days;
    }

    public String getDetails() {
        return brand + " [" + registrationNumber + "]";
    }
}
