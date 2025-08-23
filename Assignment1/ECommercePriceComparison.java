package Assignment1;

import java.util.Scanner;

public class ECommercePriceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price from Website 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter price from Website 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter price from Website 3: ");
        double price3 = sc.nextDouble();

        // Find lowest price
        double lowest = (price1 < price2) ? (price1 < price3 ? price1 : price3) : (price2 < price3 ? price2 : price3);

        // Find highest price
        double highest = (price1 > price2) ? (price1 > price3 ? price1 : price3) : (price2 > price3 ? price2 : price3);

        // Calculate percentage difference
        double diffPercent = ((highest - lowest) / lowest) * 100;

        System.out.println("---- Price Report ----");
        System.out.println("Website 1 Price: ₹" + price1);
        System.out.println("Website 2 Price: ₹" + price2);
        System.out.println("Website 3 Price: ₹" + price3);
        System.out.println("Best Deal: ₹" + lowest);
        System.out.printf("Price Difference: %.2f%% ", diffPercent);
    }
}

