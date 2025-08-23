package Assignment3.VehicleRentalApplication;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR123", "Toyota", 50.0, 5);
        Vehicle v2 = new Bike("BIKE456", "Yamaha", 20.0, 150);
        Vehicle v3 = new Truck("TRK789", "Volvo", 100.0, 5000);

        System.out.println(v1.getDetails() + " rental for 3 days: " + v1.calculateRental(3));
        System.out.println(v2.getDetails() + " rental for 2 days: " + v2.calculateRental(2));
        System.out.println(v3.getDetails() + " rental for 5 days: " + v3.calculateRental(5));
    }
}
