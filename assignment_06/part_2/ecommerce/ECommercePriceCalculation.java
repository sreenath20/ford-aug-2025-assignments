package assignment_06.part_2.ecommerce;

import java.util.Scanner;

public class ECommercePriceCalculation {
    public static void main(String[] args) {
        System.out.println(" Welcome to E-Commerce Checkout System! \n");

        Checkout checkout = new Checkout();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("--- Product Checkout ---");

                System.out.print("Enter product price (or 'exit' to quit): Rs.");
                String priceInput = scanner.nextLine();

                if (priceInput.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for shopping with us! ");
                    break;
                }

                System.out.print("Enter quantity: ");
                String quantityInput = scanner.nextLine();

                double price = Double.parseDouble(priceInput);
                int quantity = Integer.parseInt(quantityInput);

                double total = checkout.calculateTotal(price, quantity);

                System.out.println("Checkout successful!");
                checkout.displayOrderSummary(price, quantity, total);

            } catch (NumberFormatException e) {
                // Handle invalid number format
                System.out.println(" Quantity should be a whole number (e.g., 5)");

            } catch (IllegalArgumentException e) {
                // Handle zero or negative values
                System.out.println(e.getMessage());
                System.out.println("Both price and quantity must be positive numbers.");

            } catch (ArithmeticException e) {
                // Handle overflow or calculation errors
                System.out.println(e.getMessage());
                System.out.println("Please reduce the quantity or choose a different product.");

            } finally {
                System.out.println("Checkout process complete");
                System.out.println();
            }
        }
    }
}
