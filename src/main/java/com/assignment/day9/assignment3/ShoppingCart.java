package com.assignment.day9.assignment3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public void addItem(List<CartItem> cart, CartItem item) {
        int index = cart.indexOf(item);
        if (index != -1) {
            CartItem existingItem = cart.get(index);
            existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
        } else {
            cart.add(item);
        }
    }

    public void removeItem(List<CartItem> cart, int itemId) {
        cart.removeIf(item -> item.getItemId() == itemId);
    }

    public void updateItemQuantity(List<CartItem> cart, int itemId, int newQuantity) {
        for (CartItem item : cart) {
            if (item.getItemId() == itemId) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void searchItemByName(List<CartItem> cart, int itemId) {
        for (CartItem item : cart) {
            if (item.getItemId() == itemId) {
                System.out.println("Found Item: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Price per Unit: " + item.getPricePerUnit());
                return;
            }
        }
        System.out.println("Item not found: " + itemId);
    }

    public void getTotalBillAmount(List<CartItem> cart) {
        double total = 0.0;
        for (CartItem item : cart) {
            total += item.getQuantity() * item.getPricePerUnit();
        }
        System.out.println("Total Bill Amount: " + total);
    }

    public static void main(String[] args) {
        List<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem(1, "Apple", 2, 3.0));
        cart.add(new CartItem(2, "Banana", 5, 1.0));
        cart.add(new CartItem(3, "Orange", 3, 2.0));
        System.out.println("Shopping Cart Items:");
        for (CartItem item : cart) {
            System.out.println("Item ID: " + item.getItemId() +
                    ", Name: " + item.getItemName() +
                    ", Quantity: " + item.getQuantity() +
                    ", Price per Unit: " + item.getPricePerUnit());
        }

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(cart, new CartItem(2, "Banana", 2, 1.0)); // Adding more bananas
        System.out.println("Shopping Cart Items: AFTER ADDING MORE BANANAS");
        for (CartItem item : cart) {
            System.out.println("Item ID: " + item.getItemId() +
                    ", Name: " + item.getItemName() +
                    ", Quantity: " + item.getQuantity() +
                    ", Price per Unit: " + item.getPricePerUnit());
        }
        shoppingCart.removeItem(cart, 1); // Removing apples
        System.out.println("Shopping Cart Items: AFTER REMOVING APPLES");
        for (CartItem item : cart) {
            System.out.println("Item ID: " + item.getItemId() +
                    ", Name: " + item.getItemName() +
                    ", Quantity: " + item.getQuantity() +
                    ", Price per Unit: " + item.getPricePerUnit());
        }
        shoppingCart.updateItemQuantity(cart, 3, 5); // Updating quantity of oranges
        System.out.println("Shopping Cart Items: AFTER UPDATING QUANTITY OF ORANGES");
        for (CartItem item : cart) {
            System.out.println("Item ID: " + item.getItemId() +
                    ", Name: " + item.getItemName() +
                    ", Quantity: " + item.getQuantity() +
                    ", Price per Unit: " + item.getPricePerUnit());
        }
        shoppingCart.searchItemByName(cart, 2); // Searching for bananas
        shoppingCart.getTotalBillAmount(cart); // Calculating total bill amount



    }
}
