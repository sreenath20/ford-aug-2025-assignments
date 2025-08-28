package day3.Assignment5;

public class Driver {
    public static void main(String[] args) {
        Vehicle car = new Car(9482,"Hyundai",500,5);
        Vehicle bike = new Bike(9048,"Triumph",250,140);
        Vehicle truck = new Truck(8055,"Ashok Laland",1500,1000);
        System.out.println("The rental price for the car for 10 days is "+ car.calculateRent(10));
        System.out.println("The rental price for the bike for 10 days is "+ bike.calculateRent(10));
        System.out.println("The rental price for the truck for 10 days is "+ truck.calculateRent(10));
    }
}
