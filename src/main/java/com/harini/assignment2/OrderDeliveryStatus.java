package com.harini.assignment2;

import java.util.Scanner;

public class OrderDeliveryStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of products ");
        int orders = input.nextInt();
        String[] OrderStatus = new String[orders];
        for (int i = 0; i < orders; i++) {
            System.out.print("Enter the order status of product " + (i + 1) + ": ");
            OrderStatus[i] = input.next().substring(0,1).toUpperCase();
            //OrderStatus[i] = Character.toUpperCase(OrderStatus[i]);
        }
        int StatusP = 0;
        int StatusC = 0;
        int StatusD = 0;
        int StatusF = 0;
        for (String Order : OrderStatus) {
            switch (Order) {
                case "P":
                    StatusP++;
                    break;
                case "C":
                    StatusC++;
                    break;
                case "D":
                    StatusD++;
                    break;
                case "F":
                    StatusF++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("---------------Order Summary----------------");
        System.out.println("The no of products in pending are " + StatusP);
        System.out.println("The no of products being cancelled are " + StatusC);
        System.out.println("The no of products delivered are " + StatusD);
        System.out.println("The no of products failed are " + StatusF);
    }
}
