package Assignment4.VehicleServiceManagementSystem;


public class Driver {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Brezza");
        car.service();
        car.repair();

        System.out.println();

        Bike bike = new Bike("Yamaha", "Rx100");
        bike.service();
        bike.repair();
    }
}

