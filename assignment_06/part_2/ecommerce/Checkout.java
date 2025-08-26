package assignment_06.part_2.ecommerce;

import java.util.Scanner;

// Checkout.java - Checkout class for price calculation
class Checkout {

    // Method to calculate total price
    public double calculateTotal(double price, int quantity) {
        // Check if price is zero or negative
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero. Entered: Rs." + price);
        }

        // Check if quantity is zero or negative
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero. Entered: " + quantity);
        }

        // Calculate total (price * quantity)
        double total = price * quantity;

        // Check for overflow simulation (if total is too large)
        if (total > 1000000) {  // Simulate overflow for demo purposes
            throw new ArithmeticException("Total amount too large: Rs." + total + " (exceeds limit)");
        }

        return total;
    }

    public void displayOrderSummary(double price, int quantity, double total) {
        System.out.println("--- Order Summary ---");
        System.out.println("Price per item: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total amount: Rs." + total);
    }
}