public class Car extends Vehicle implements Repairable{


    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    void service() {
        System.out.println("Car service :"+brand+" "+model);
    }

    @Override
    public void repair() {
        System.out.println("repairing car....");
    }
}
