package day4.vehicleService;

public class VehicleDriver {
    public static void main(String[] args) {
        Car car=new Car();
        car.service("Toyota","Corolla");
        car.repair("engine");

        Bike bike=new Bike();
        bike.service("Yamaha","FZ");
        bike.repair("brakes");


    }
}
