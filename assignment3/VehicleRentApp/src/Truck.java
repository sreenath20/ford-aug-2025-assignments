public class Truck extends Vehicle {
    int loadCapacity;
    public Truck(int loadCapacity) {
        super();
        this.loadCapacity = loadCapacity;
    }
    public Truck(){

    }

    public Truck(int registrationNumber, String brand, double rentalRate, int loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public double calculateRental(int daysRented) {
        return super.calculateRental(daysRented) + getLoadCapacity()*3;
    }
}
