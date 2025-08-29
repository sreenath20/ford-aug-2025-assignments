import java.util.Scanner;

public class TollBoothBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Toll Booth Billing System");
        System.out.println("--------------------------");
        System.out.println("Toll price of Car: " + "" + 100);
        System.out.println("Toll price of Truck: " + "" + 250);
        System.out.println("Toll price of Bike: " + "" + 50);
        System.out.println("Toll price of Bus: " + "" + 200);
        System.out.println("Enter number of vehicles:");
        int size = sc.nextInt();
        int cars = 0;
        int bikes = 0;
        int trucks = 0;
        int bus = 0;
        String[] vehicles = new String[size];
        System.out.println("Enter vehicle names:");
        int tollCollection = 0;
        for (int i = 0; i < size; i++) {
            vehicles[i] = sc.next();
            switch (vehicles[i]) {
                case "Car":
                    cars++;
                    tollCollection += 100;
                    break;
                case "Bike":
                    bikes++;
                    tollCollection += 50;
                    break;
                case "Truck":
                    trucks++;
                    tollCollection += 250;
                    break;
                case "Bus":
                    bus++;
                    tollCollection += 200;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        }
        System.out.println("Total toll collection is: " + "" + tollCollection);
        System.out.println("Total cars entered: " + "" + cars);
        System.out.println("Total bikes entered: " + "" + bikes);
        System.out.println("Total trucks entered: " + "" + trucks);
        System.out.println("Total buses entered: " + "" + bus);


    }
}
