package day4.Assignment2;

public class Bike extends Vehicles implements Repairable{
    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void repair(String repairPart) {
        System.out.println("Repairing bike "+repairPart+"............");
    }

    @Override
    public void service() {
        System.out.println("Servicing bike : "+brand+" "+model);
    }
}
