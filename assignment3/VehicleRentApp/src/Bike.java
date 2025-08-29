public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public Bike(){

    }

    public Bike(int registrationNumber, String brand, double rentalRate, int engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRental(int daysRented) {
        return super.calculateRental(daysRented) + getEngineCapacity();
    }
}
