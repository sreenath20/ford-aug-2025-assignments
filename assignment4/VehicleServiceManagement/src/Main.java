//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car car=new Car("suzuki","alto 800");
    car.repair();
    car.service();
    System.out.println("-----------------");
    Bike bike=new Bike("hero honda","passion pro");
    bike.repair();
    bike.service();

    }
}

