package com.ford.assignment8;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// CartItem class
class CartItem {
    int itemId;
    String itemName;
    int quantity;
    double pricePerUnit;

    public CartItem(int itemId, String itemName, int quantity, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "CartItem{id=" + itemId + ", name='" + itemName + "', quantity=" + quantity + ", price=" + pricePerUnit + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CartItem)) return false;
        CartItem other = (CartItem) obj;
        return this.itemId == other.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }
}

// ShoppingCart class
class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(CartItem item) {
        int index = cart.indexOf(item);
        if (index != -1) {
            CartItem existing = cart.get(index);
            existing.quantity += item.quantity;
            System.out.println("Item already in cart. Increased quantity.");
        } else {
            cart.add(item);
            System.out.println("Item added to cart.");
        }
    }

    public void removeItem(int itemId) {
        CartItem temp = new CartItem(itemId, "", 0, 0);
        if (cart.remove(temp)) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void updateQuantity(int itemId, int newQuantity) {
        CartItem temp = new CartItem(itemId, "", 0, 0);
        int index = cart.indexOf(temp);
        if (index != -1) {
            cart.get(index).quantity = newQuantity;
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void searchItem(int itemId) {
        CartItem temp = new CartItem(itemId, "", 0, 0);
        int index = cart.indexOf(temp);
        if (index != -1) {
            System.out.println("Item found: " + cart.get(index));
        } else {
            System.out.println("Item not found.");
        }
    }

    public double getTotalBill() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.quantity * item.pricePerUnit;
        }
        return total;
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : cart) {
                System.out.println(item);
            }
        }
    }
}

// Main class
public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. Display Cart");
            System.out.println("6. Get Total Bill");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price per Unit: ");
                    double price = sc.nextDouble();
                    cart.addItem(new CartItem(id, name, qty, price));
                }
                case 2 -> {
                    System.out.print("Enter Item ID to remove: ");
                    int id = sc.nextInt();
                    cart.removeItem(id);
                }
                case 3 -> {
                    System.out.print("Enter Item ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int qty = sc.nextInt();
                    cart.updateQuantity(id, qty);
                }
                case 4 -> {
                    System.out.print("Enter Item ID to search: ");
                    int id = sc.nextInt();
                    cart.searchItem(id);
                }
                case 5 -> cart.displayCart();
                case 6 -> System.out.println("Total Bill: ₹" + cart.getTotalBill());
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);


    }
}
