package Assignment62_Javaexceptionhandlingassignments;

import java.util.Scanner;

public class Checkout {


    public static double calculateTotal(double price, int quantity) {
        if (price <= 0.0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and quantity must be greater than zero.");
        }

        double total = price * (double) quantity;

        if (Double.isInfinite(total) || Double.isNaN(total)) {
            throw new ArithmeticException("Overflow during total calculation.");
        }

        return total;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter price: ");
            String priceInput = scanner.nextLine();

            System.out.print("Enter quantity: ");
            String quantityInput = scanner.nextLine();

            try {
                double price = Double.parseDouble(priceInput);        // may throw NumberFormatException
                int quantity = Integer.parseInt(quantityInput);      // may throw NumberFormatException

                double total = calculateTotal(price, quantity);      // may throw IllegalArgumentException or ArithmeticException
                System.out.printf("Total: %.2f%n", total);

            } catch (NumberFormatException nfe) {
                System.out.println("Please enter numeric values for price and quantity.");
            } catch (IllegalArgumentException iae) {
                System.out.println("Invalid price or quantity entered.");
            } catch (ArithmeticException ae) {
                System.out.println("Calculation error: overflow or invalid result.");
            } finally {
                System.out.println("Checkout process complete");
            }
        }
    }
}

