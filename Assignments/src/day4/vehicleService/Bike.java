package day4.vehicleService;

public class Bike extends Vehicle implements Repairable{
//    public Bike() {
//    }
    @Override
    public void repair(String part) {
        System.out.println("Repairing bike "+part);
    }

    @Override
    public void service(String brand,String model) {
        System.out.println("Servicing bike:"+brand+" "+model);
    }
}
