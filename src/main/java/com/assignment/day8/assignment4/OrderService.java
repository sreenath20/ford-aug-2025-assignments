package com.assignment.day8.assignment4;

class InvalidOrderQuantityException extends Exception {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}

public class OrderService {
    public void placeOrder(String product, int quantity) throws InvalidOrderQuantityException {
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }
        // Logic to place the order
        System.out.println("Order placed for " + quantity + " units of " + product);
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        try {
            orderService.placeOrder("Laptop", 5); // Valid order
            orderService.placeOrder("Phone", 0); // Invalid order
        } catch (InvalidOrderQuantityException e) {
            System.err.println(e.getMessage());
        }
    }

}
