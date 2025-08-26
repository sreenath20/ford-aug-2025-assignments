package assignment_07.ecommerce_order_processing;

import java.util.Scanner;

public class EcommerceOrderProcessing {
    public static void main(String[] args) {
        System.out.println("E-commerce Order Processing System \n");
        OrderService orderService = new OrderService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Order Placement ---");
        while (true) {
            try {
                System.out.print("Enter product name (or 'exit' to quit): ");
                String productName = scanner.nextLine();

                if (productName.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for shopping with us! ");
                    break;
                }

                if (productName.isEmpty()) {
                    System.out.println("Product name cannot be empty.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Placing order for " + productName + " (Quantity: " + quantity + ")...");
                orderService.placeOrder(quantity);

            } catch (InvalidOrderQuantityException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for quantity.");

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
