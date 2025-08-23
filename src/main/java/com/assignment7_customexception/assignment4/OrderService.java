package com.assignment7_customexception.assignment4;

public class OrderService {
    public void placeOrder(String productName,int quantity) throws InvalidOrderQuantityException {
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException(" Placing order for  "+productName+"  (Quantity: " + quantity + "). → Error: Order quantity must be greater than zero.");
        }
        // Logic to place the order
        System.out.println( "Placing order for "+productName+" (Quantity: " + quantity + ")..-> Error: → Order placed successfully");
    }
}
