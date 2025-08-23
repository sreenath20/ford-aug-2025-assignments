package com.assignment6_part2.assignment2;

public class Checkout {

    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and quantity must be positive values.");
        }

        double total = price * quantity;

        // Check for overflow - simulate overflow detection
        if (total == Double.POSITIVE_INFINITY || total > Double.MAX_VALUE) {
            throw new ArithmeticException("Calculation overflow occurred.");
        }

        return total;
    }
}
