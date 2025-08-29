//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        car object
        Car car = new Car(452542,"suzuki",2000.0,5);
        car.setRentalRate(2000.0);
        car.setSeatingCapacity(5);
        System.out.println("Rent for car is " + car.calculateRental(3));

        //bike object
        Bike bike = new Bike(123454, "kawasaki", 1000.0, 9);
        System.out.println("rent for bike is " + bike.calculateRental(3));

//      Truck object

        Truck truck = new Truck(98765, "volvo", 10000.0, 10000);
        System.out.print("rent for truck is " + truck.calculateRental(30));

    }
}