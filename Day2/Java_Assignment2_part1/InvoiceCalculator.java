

import java.util.Scanner;

public class InvoiceCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int ITEMS = 5;
            double total = 0.0;
            System.out.println("Enter prices for " + ITEMS + " items:");
            for (int i = 1; i <= ITEMS; i++) {
                System.out.print("Price of item " + i + ": ");
                double price = Double.parseDouble(sc.nextLine().trim());
                total += price;
            }
            System.out.printf("Total invoice amount: %.2f%n", total);
        }
    }
}

