package day3.Assignment5;

public class Bike extends Vehicle {
    int engineCapacity;

    public Bike(int registrationNumber, String brand, double rentalRate, int engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRent(int days) {
        super.calculateRent(days);
        if (engineCapacity > 200) {
            rent += 400;
        }
        return rent;
    }
}
