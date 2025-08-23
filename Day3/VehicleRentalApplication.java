abstract class Vehicle {
    private String registrationNumber;
    private String brand;
    private double rentalRate; // per day

    public Vehicle(String registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber; this.brand = brand; this.rentalRate = rentalRate;
    }
    public double calculateRental(int days) {
        return rentalRate * days;
    }
    public String getBrand() { return brand; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getRentalRate() { return rentalRate; }
    public abstract void display();
}

class Car extends Vehicle {
    private int seatingCapacity;
    public Car(String reg, String brand, double rate, int seatingCapacity) {
        super(reg, brand, rate);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void display() {
        System.out.println("Car[" + getRegistrationNumber() + ", " + getBrand()
                + ", seating=" + seatingCapacity + ", rate=" + getRentalRate() + "]");
    }
}

class Bike extends Vehicle {
    private int engineCapacity;
    public Bike(String reg, String brand, double rate, int engineCapacity) {
        super(reg, brand, rate);
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void display() {
        System.out.println("Bike[" + getRegistrationNumber() + ", " + getBrand()
                + ", engine=" + engineCapacity + "cc, rate=" + getRentalRate() + "]");
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(String reg, String brand, double rate, double loadCapacity) {
        super(reg, brand, rate);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void display() {
        System.out.println("Truck[" + getRegistrationNumber() + ", " + getBrand()
                + ", load=" + loadCapacity + " tons, rate=" + getRentalRate() + "]");
    }
}

public class VehicleRentalApplication {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR123","Toyota",50.0,5);
        Vehicle v2 = new Bike("BIK456","Yamaha",20.0,150);
        Vehicle v3 = new Truck("TRK789","Volvo",150.0,10.0);

        Vehicle[] vehicles = {v1, v2, v3};
        for (Vehicle v : vehicles) {
            v.display();
            System.out.println("  Rental for 3 days: $" + v.calculateRental(3));
        }
    }
}

