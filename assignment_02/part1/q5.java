package assignment_02.part1;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("\n-------    Sales Summary by Region    -------");
          /*Write a Java program that accepts sales for 4 regions (North, South, East, West) using a for loop
          and then categorizes each region as:
          • High (sales > 10000)
          • Medium (sales > 5000)
          • Low (sales ≤ 5000)*/
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the region " + (i + 1) + ": ");
            String region = sc.nextLine();
            System.out.print("Enter the sales for " + region + ": ");
            Integer sales = Integer.parseInt(sc.nextLine());
            if (sales > 10000) {
                System.out.println("Sales is High in " + region);
            } else if (sales > 5000) {
                System.out.println("Sales is Medium in " + region);
            } else {
                System.out.println("Sales is Low in " + region);
            }
            System.out.println();
        }
    }
}

