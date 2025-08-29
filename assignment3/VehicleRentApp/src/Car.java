public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public Car(int registrationNumber, String brand, double rentalRate, int seatingCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    public Car() {

    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double calculateRental(int daysRented) {
        return super.calculateRental(daysRented) + getSeatingCapacity()*2;
    }
}
