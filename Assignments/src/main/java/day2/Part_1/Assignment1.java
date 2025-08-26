package day2.Part_1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        // Loop for 5 items
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            total += price;
        }

        System.out.println("Total Invoice Amount: ₹" + total);
    }
}
