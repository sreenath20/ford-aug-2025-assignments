package com.assignment2_loopandswitch;

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of vehcile");
        int vehiclecount = input.nextInt();
        String[] vehicle = new String[vehiclecount];

        for (int i = 0; i < vehiclecount; i++) {
            System.out.println("enter the name of the vehicle(car, truck, bike,bus)");
            vehicle[i] = input.next().toLowerCase();
        }

        System.out.println("number of vehicle  passed to toll booth  " + Arrays.toString(vehicle));
        int car = 0;
        int truck = 0;
        int bike = 0;
        int bus = 0;
        for (int i = 0; i < vehiclecount; i++) {
            String vehicletype = vehicle[i];
            switch (vehicletype) {
                case "car":
                    System.out.println("car is entered ");
                    car++;
                    break;
                case "truck":
                    System.out.println("truck is entered ");
                    truck++;
                    break;
                case "bike":
                    System.out.println("Bike is entered");
                    bike++;
                    break;
                case "bus":
                    System.out.println("bus is entered");
                    bus++;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        Double totalcollection = (double) ((car * 100) + (truck * 250) + (bike * 50) + (bus * 200));
        System.out.println("Total number of cars " + car);
        System.out.println("Total number of trucks " + truck);
        System.out.println("total number of the bike " + bike);
        System.out.println("total number of the bus " + bus);
        System.out.println("Total collection price is %.2f%n  " + totalcollection);
    }

}
