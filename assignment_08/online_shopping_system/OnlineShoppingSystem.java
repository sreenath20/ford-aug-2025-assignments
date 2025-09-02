package assignment_08.online_shopping_system;

import java.util.*;

public class OnlineShoppingSystem {
    private static ArrayList<CartItem> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Yelana's Cart: ");
        ShoppingCart cart = new ShoppingCart();

        cart.displayCart();
        while (true) {
            System.out.println("\n1. Add Item  2. Remove Item  3. Update Quantity  4. Search Item  5. Display Cart  6. Total Bill  7. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addItem(); break;
                case 2: removeItem(); break;
                case 3: updateQuantity(); break;
                case 4: searchItem(); break;
                case 5: displayCart(); break;
                case 6: showTotalBill(); break;
                case 7: System.out.println("Thank you for shopping!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addItem() {
        System.out.print("Item ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (CartItem item : cart) {
            if (item.itemId == id) {
                System.out.print("Item exists! Add quantity: ");
                int addQty = sc.nextInt();
                item.quantity += addQty;
                System.out.println("Quantity updated!");
                return;
            }
        }

        System.out.print("Item Name: ");
        String name = sc.nextLine();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Price per unit: Rs.");
        double price = sc.nextDouble();

        cart.add(new CartItem(id, name, quantity, price));
        System.out.println("Item added to cart!");
    }

    private static void removeItem() {
        System.out.print("Enter Item ID to remove: ");
        int id = sc.nextInt();

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemId == id) {
                cart.remove(i);
                System.out.println("Item removed from cart!");
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }

    private static void updateQuantity() {
        System.out.print("Enter Item ID to update: ");
        int id = sc.nextInt();

        for (CartItem item : cart) {
            if (item.itemId == id) {
                System.out.print("New Quantity: ");
                item.quantity = sc.nextInt();
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }

    private static void searchItem() {
        System.out.print("Enter Item ID to search: ");
        int id = sc.nextInt();

        CartItem searchItem = new CartItem(id, "", 0, 0);
        if (cart.contains(searchItem)) {
            int index = cart.indexOf(searchItem);
            System.out.println("Found at position: " + (index + 1));
            cart.get(index).displayItem();
        } else {
            System.out.println("Item not found in cart!");
        }
    }

    private static void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }

        System.out.println("\nYour Shopping Cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.print((i + 1) + ". ");
            cart.get(i).displayItem();
        }
    }

    private static void showTotalBill() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = 0;
        for (CartItem item : cart) {
            total += item.quantity * item.pricePerUnit;
        }
        System.out.println("\nTotal Bill: Rs." + total);
    }
}
