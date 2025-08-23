package com.fullstackabi.assignment.Assign7.CustomException.Ex4;

public class OrderService {
//
//        String productName;
//        int quantity;

    void placeOrder(String productName, int Quantity) throws InvalidOrderQuantityException {
        if (Quantity <= 0) {
            // unchecked exception is thrown during runtime. this is not handled by complier.
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        } else {
            System.out.println("Order placed for product " + productName + " with quantity " + Quantity);
            System.out.println("Ordered Placed Successfully");
        }
    }
}
