package day4.vehicleService;

public class Car extends Vehicle implements Repairable{
    public Car() {
    }


    @Override
    public void repair(String part) {
        System.out.println("Repairing car "+part);
    }

    @Override
    public void service(String brand,String model) {
        System.out.println("Servicing car:"+brand+" "+model);
    }
}
