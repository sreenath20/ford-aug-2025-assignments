package com.ford.assignment7;

class InvalidOrderQuantityException extends RuntimeException {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}

class OrderService {
    public void placeOrder(String productName, int quantity) {
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }
        System.out.println("Placing order for " + productName + " (Quantity: " + quantity + ")... Order placed successfully.");
    }
}

public class OrderProcessingMain {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        try {
            service.placeOrder("Laptop", 1);
            service.placeOrder("Phone", 0);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
