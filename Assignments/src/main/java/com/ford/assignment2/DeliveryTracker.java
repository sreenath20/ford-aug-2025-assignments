package com.ford.assignment2;

public class DeliveryTracker {
        public static void main(String[] args) {
            String[] statuses = {"P", "D", "C", "F", "P", "D", "P", "C", "F", "D"};

            int pendingCount = 0, deliveredCount = 0, cancelledCount = 0, failedCount = 0;

            int orderNumber = 1;
            for (String status : statuses) {
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

            System.out.println("\nSummary:");
            System.out.println("Pending: " + pendingCount);
            System.out.println("Delivered: " + deliveredCount);
            System.out.println("Cancelled: " + cancelledCount);
            System.out.println("Failed: " + failedCount);
        }


}
