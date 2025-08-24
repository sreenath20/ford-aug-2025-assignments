package day2Part2;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vehicles = new String[5];
        int totalToll = 0;
        int carCount = 0, truckCount = 0, bikeCount = 0, busCount = 0;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.print("Enter vehicle type (Car/Truck/Bike/Bus) for vehicle " + (i + 1) + ": ");
            vehicles[i] = sc.next();
        }

        for (String vehicle : vehicles) {
            switch (vehicle.toLowerCase()) {
                case "car":
                    totalToll += 100;
                    carCount++;
                    break;
                case "truck":
                    totalToll += 250;
                    truckCount++;
                    break;
                case "bike":
                    totalToll += 50;
                    bikeCount++;
                    break;
                case "bus":
                    totalToll += 200;
                    busCount++;
                    break;
                default:
                    System.out.println("Unknown vehicle: " + vehicle);
            }
        }

        System.out.println("\nTotal Toll Collection: ₹" + totalToll);
        System.out.println("Cars: " + carCount);
        System.out.println("Trucks: " + truckCount);
        System.out.println("Bikes: " + bikeCount);
        System.out.println("Buses: " + busCount);
    }
}
