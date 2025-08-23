
abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void service();
}

interface Repairable {
    void repair();
}

class Car extends Vehicle implements Repairable {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void service() {
        System.out.println("Servicing car: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing car engine...");
    }
}

class Bike extends Vehicle implements Repairable {
    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void service() {
        System.out.println("Servicing bike: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing bike brakes...");
    }
}

public class VehicleServiceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.service();
        car.repair();

        Bike bike = new Bike("Yamaha", "FZ");
        bike.service();
        bike.repair();
    }
}

