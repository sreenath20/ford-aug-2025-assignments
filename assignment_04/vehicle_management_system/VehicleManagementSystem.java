package assignment_04.vehicle_management_system;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla");
        Bike bike = new Bike("Yamaha", "FZ");
        System.out.println();
        car.service();
        car.repair();
        System.out.println();
        bike.service();
        bike.repair();
    }
}