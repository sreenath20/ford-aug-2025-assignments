package com.assignment6_part2.assignment2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checkout checkout = new Checkout();

        while (true) {
            try {
                System.out.print("Enter price (or 'exit' to quit): ");
                String priceInput = scanner.nextLine();

                if (priceInput.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for shopping!");
                    break;
                }

                System.out.print("Enter quantity: ");
                String quantityInput = scanner.nextLine();

                double price = Double.parseDouble(priceInput);
                int quantity = Integer.parseInt(quantityInput);

                double total = checkout.calculateTotal(price, quantity);
                System.out.println("Total: $" + total);

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers for price and quantity.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Calculation overflow occurred.");
            } finally {
                System.out.println("Checkout process complete");
            }

            System.out.println();
        }

        scanner.close();
    }
}
