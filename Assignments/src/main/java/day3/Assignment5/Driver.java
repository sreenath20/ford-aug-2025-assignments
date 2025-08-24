package day3.Assignment5;

public class Driver {
    public static void main(String[] args) {
        Vehicle car = new Car(1234,"Toyota",250,5);
        Vehicle bike = new Bike(5678,"Hero",100,140);
        Vehicle truck = new Truck(9011,"Benz",350,3000);
        System.out.println("The rental price for the car for 10 days is "+ car.calculateRent(10));
        System.out.println("The rental price for the bike for 10 days is "+ bike.calculateRent(10));
        System.out.println("The rental price for the truck for 10 days is "+ truck.calculateRent(10));
    }
}
