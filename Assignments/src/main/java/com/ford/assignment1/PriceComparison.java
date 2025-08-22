package com.ford.assignment1;

import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price from website 1: ");
        Double p1 = sc.nextDouble();
        System.out.print("Enter price from website 2: ");
        Double p2 = sc.nextDouble();
        System.out.print("Enter price from website 3: ");
        Double p3 = sc.nextDouble();


        double lowest = (p1 < p2) ? ((p1 < p3) ? p1 : p3) : ((p2 < p3) ? p2 : p3);
        double highest = (p1 > p2) ? ((p1 > p3) ? p1 : p3) : ((p2 > p3) ? p2 : p3);


        String bestDeal = (lowest == p1) ? "Website 1" : (lowest == p2) ? "Website 2" : "Website 3";


        double diffPercent = ((highest - lowest) / highest) * 100;

        System.out.println("Prices: Website1 " + p1 + "Website2 = " + p2 + " Website3 =" + p3);
        System.out.println("Best Deal: " + bestDeal + " at price " + String.format("%.2f", lowest));
        System.out.println("Price difference percentage:" + diffPercent);
    }


}
