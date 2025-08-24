package day4.Assignment2;

public class Car extends Vehicles implements Repairable{
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void repair(String repairPart) {
        System.out.println("Repairing car "+repairPart+"............");
    }

    @Override
    public void service() {
        System.out.println("Servicing car : "+brand+" "+model);
    }
}
