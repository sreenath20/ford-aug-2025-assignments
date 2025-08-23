

import java.util.Locale;
import java.util.Scanner;

public class TollBoothBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VEHICLES = 5;
        String[] vehicles = new String[VEHICLES];

        System.out.println("Enter " + VEHICLES + " vehicle types (Car, Truck, Bike, Bus):");
        for (int i = 0; i < VEHICLES; i++) {
            System.out.print("Vehicle " + (i + 1) + ": ");
            vehicles[i] = sc.nextLine().trim();
        }

        int countCar = 0, countTruck = 0, countBike = 0, countBus = 0;
        int totalCollection = 0;

        for (String v : vehicles) {
            String vt = (v == null) ? "" : v.trim().toLowerCase(Locale.ROOT);
            switch (vt) {
                case "car":
                    totalCollection += 100;
                    countCar++;
                    break;
                case "truck":
                    totalCollection += 250;
                    countTruck++;
                    break;
                case "bike":
                    totalCollection += 50;
                    countBike++;
                    break;
                case "bus":
                    totalCollection += 200;
                    countBus++;
                    break;
                default:
                    System.out.println("Unknown vehicle type '" + v + "' - charged 0.");
            }
        }

        System.out.println("\nToll Summary:");
        System.out.println("Cars: " + countCar);
        System.out.println("Trucks: " + countTruck);
        System.out.println("Bikes: " + countBike);
        System.out.println("Buses: " + countBus);
        System.out.println("Total Toll Collection: ₹" + totalCollection);

        sc.close();
    }
}
