package day4.Assignment2;

public class Driver {
    public static void main(String[] args) {
        Car car= new Car("Toyota","Corolla");
        Bike bike= new Bike("Yamaha","FZ");
        car.service();
        car.repair("engine");
        bike.service();
        bike.repair("brake");
    }
}
