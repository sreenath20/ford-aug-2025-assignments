package com.ford.assignment2;

public class TollBooth {
    public static void main(String[] args) {
        String[] vehicles = {"Car", "Truck", "Bike", "Car", "Bus"};

        int totalToll = 0;
        int carCount = 0, truckCount = 0, bikeCount = 0, busCount = 0;

        for (String vehicle : vehicles) {
            switch (vehicle) {
                case "Car":
                    totalToll += 100;
                    carCount++;
                    break;
                case "Truck":
                    totalToll += 250;
                    truckCount++;
                    break;
                case "Bike":
                    totalToll += 50;
                    bikeCount++;
                    break;
                case "Bus":
                    totalToll += 200;
                    busCount++;
                    break;
                default:
                    System.out.println("Unknown vehicle type: " + vehicle);
            }
        }

        System.out.println("Total Toll Collection: ₹" + totalToll);
        System.out.println("Number of Cars: " + carCount);
        System.out.println("Number of Trucks: " + truckCount);
        System.out.println("Number of Bikes: " + bikeCount);
        System.out.println("Number of Buses: " + busCount);
    }


}
