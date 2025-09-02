package assignment_08.online_shopping_system;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        if (cart.contains(item)) {
            for (CartItem cartItem : cart) {
                if (cartItem.itemId == item.itemId) {
                    cartItem.quantity += item.quantity;
                    break;
                }
            }
        } else {
            cart.add(item);
        }
        System.out.println("Item added successfully!");
    }

    public void removeItem(int itemId) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemId == itemId) {
                cart.remove(i);
                System.out.println("Item removed successfully!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void updateQuantity(int itemId, int newQuantity) {
        for (CartItem item : cart) {
            if (item.itemId == itemId) {
                item.quantity = newQuantity;
                System.out.println("Quantity updated successfully!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public CartItem searchItem(int itemId) {
        for (CartItem item : cart) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        return null;
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
            System.out.println("Cart is empty!");
            return;
        }
        for (CartItem item : cart) {
            System.out.println(item);
        }
    }
}
