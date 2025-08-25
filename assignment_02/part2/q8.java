package assignment_02.part2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carToll=0, busToll=0, truckToll=0, bikeToll=0;
        int carTotal=0, busTotal=0, truckTotal=0, bikeTotal=0;
        int tollTotal = 0;
        System.out.println("-----  Toll Booth Billing System  -----");
        String[] vehicle = new String[5];
        for (int i = 0; i < vehicle.length; i++) {
            System.out.println("Enter vehicle "+(i+1)+" type:");
            String input = sc.nextLine().toUpperCase();
            while (!input.equals("CAR") && !input.equals("BUS") && !input.equals("BIKE") && !input.equals("TRUCK")) {
                System.out.println("Invalid Input! Please enter a valid input: ");
                input = sc.nextLine().toUpperCase();
            }
            vehicle[i] = input;

        }
        for (int i = 0; i < vehicle.length; i++) {
            if(vehicle[i].equals("CAR")) {
                carToll +=100;
                carTotal++;
            }
            else if(vehicle[i].equals("BUS")) {
                busToll +=200;
                busTotal++;
            }
            else if(vehicle[i].equals("BIKE")) {
                bikeToll +=50;
                bikeTotal++;
            }
            else if(vehicle[i].equals("TRUCK")) {
                truckToll +=250;
                truckTotal++;
            }
            tollTotal = carToll + busToll + truckToll + bikeToll ;
        }
        System.out.println("\nTotal Collection: "+ tollTotal);
        System.out.println("\n----- Number of each Vehicle -----");
        System.out.println("Car: "+carTotal);
        System.out.println("Bus: "+busTotal);
        System.out.println("Truck: "+truckTotal);
        System.out.println("Bike: "+bikeTotal);
    }
}
