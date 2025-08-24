package com.fullstackabi.assignment.Assign2.Part1.controlcondloop;

import java.util.Scanner;

public class SalesSummary {
    public static void main(String[] args) {

        // Sales Summary by Region
        String[] regions = {"North", "South", "East", "West"};
        double[] sales =new double[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < regions.length; i++) {
            System.out.println("Enter sales for the " + regions[i]);
            sales[i] = sc.nextDouble();
        }
        for (int i = 0; i < regions.length; i++) {
            String region = regions[i];
            double salesAmount = sales[i];
            String category;
            // replace with switch
            if (salesAmount > 10000) {
                category = "High";
            } else if (salesAmount > 5000) {
                category = "Medium";
            } else {
                category = "Low";
            }
            System.out.println("Sales in the " + region + " Region is " + salesAmount + " which Falls in the category " + category);

        }
    }
}