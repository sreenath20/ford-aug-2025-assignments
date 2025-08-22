package assignment_02.part2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deliveryStatus = new String[10];

        System.out.println("----------    E-COMMERCE DELIVERY TRACKER    ----------");
        System.out.println("Enter delivery status for each order:");
        System.out.println("P = Pending, D = Delivered, C = Cancelled, F = Failed\n");

        for(int i = 0; i < deliveryStatus.length; i++){
            System.out.println("Enter delivery status for order " + (i+1) + ":");
            String input = sc.nextLine().toUpperCase();
            while(!input.equals("P") && !input.equals("D") && !input.equals("C") && !input.equals("F")){
                System.out.println("Invalid Status! Please enter a valid Status for order "+ (i+1) +": ");
                input = sc.nextLine().toUpperCase();
            }
            deliveryStatus[i] = input;
        }
        System.out.println("\n-----  DELIVERY STATUS REPORT  -----");

        int orderNumber = 1;
        int pendingCount = 0, deliveredCount = 0, cancelledCount = 0, failedCount = 0;
        for (String status : deliveryStatus) {
            System.out.print("Order " + orderNumber + ": ");

            switch (status) {
                case "P":
                    System.out.println("Pending");
                    pendingCount++;
                    break;
                case "D":
                    System.out.println("Delivered");
                    deliveredCount++;
                    break;
                case "C":
                    System.out.println("Cancelled");
                    cancelledCount++;
                    break;
                case "F":
                    System.out.println("Failed");
                    failedCount++;
                    break;
                default:
                    System.out.println("Unknown Status");
            }
            orderNumber++;
        }
        System.out.println("\n-----  DELIVERY SUMMARY  -----");
        System.out.println("Total Orders: " + deliveryStatus.length);
        System.out.println("Pending: " + pendingCount);
        System.out.println("Delivered: " + deliveredCount);
        System.out.println("Cancelled: " + cancelledCount);
        System.out.println("Failed: " + failedCount);
    }
}
