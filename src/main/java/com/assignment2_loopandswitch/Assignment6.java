package com.assignment2_loopandswitch;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("order status are P = Pending\n" +
                "o D = Delivered\n" +
                "o C = Cancelled\n" +
                "o F = Failed ");
        String[] orderStatus = new String[10];
        for(int i=0;i<10;i++) {
            System.out.println("Enter the order status for order " + (i+1) + ": ");
            orderStatus[i] = input.next().toUpperCase();


        }
        System.out.println("Order Status: " + Arrays.toString(orderStatus));
        int pendingCount = 0;
        int deliveredCount = 0;
        int cancelledCount = 0;
        int failedCount = 0;

        for(int i=0;i<10;i++) {
            switch(orderStatus[i]) {
                case "P":
                    System.out.println("Order " + (i+1) + " is Pending.");
                    pendingCount++;
                    break;
                case "D":
                    System.out.println("Order " + (i+1) + " is Delivered.");
                    deliveredCount++;
                    break;
                case "C":
                    System.out.println("Order " + (i+1) + " is Cancelled.");
                    cancelledCount++;
                    break;
                case "F":
                    System.out.println("Order " + (i+1) + " has Failed.");
                    failedCount++;
                    break;
                default:
                    System.out.println("Invalid status for order " + (i+1) + ".");
            }
        }
        System.out.println("NUmber of Order Delivered " + deliveredCount + "\n" +
                "Number of Order Pending " + pendingCount + "\n" +
                "Number of Order Cancelled " + cancelledCount + "\n" +
                "Number of Order Failed " + failedCount);
    }
}
