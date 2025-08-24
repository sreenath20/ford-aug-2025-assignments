package com.harini.assignment2;

import java.util.Scanner;

public class TollBilling {
    public static void main(String[] args) {
        int size = 5;
        String[] vehicles = new String[size];
        Scanner input = new Scanner(System.in);
        double totalPrice=0;
        int car=0;
        int bus=0;
        int truck=0;
        int bike =0;
        double carPrice=100.0;
        double busPrice=200.0;
        double truckPrice=250.0;
        double bikePrice =50.0;
        for(int i=0;i<size;i++){
            System.out.print("Enter the type of vehicle ");
            vehicles[i]= input.next();
            vehicles[i]= vehicles[i].substring(0,1).toUpperCase() + vehicles[i].substring(1);
            //vehicles[i]=vehicle;
            switch (vehicles[i]){
                case "Car":
                    totalPrice+=carPrice;
                    car++;
                    break;
                case "Bus":
                    totalPrice+=busPrice;
                    bus++;
                    break;
                case "Truck":
                    totalPrice+=truckPrice;
                    truck++;
                    break;
                case "Bike":
                    totalPrice+=bikePrice;
                    bike++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("------------Toll Summary--------------");
        System.out.println("Total toll collection for the day is "+totalPrice);
        System.out.println("Total number of cars passed are "+car);
        System.out.println("Total number of buses passed are "+bus);
        System.out.println("Total number of bikes passed are "+bike);
        System.out.println("Total number of trucks passed are "+truck);
    }
}
