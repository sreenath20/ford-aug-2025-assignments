package Assignments8_JavaCollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class CartItem {
    int itemId;
    String itemName;
    int quantity;
    double pricePerUnit;

    CartItem(int itemId, String itemName, int quantity, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItem)) return false;
        CartItem other = (CartItem) o;
        return itemId == other.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return String.format("CartItem{id=%d, name='%s', qty=%d, price=%.2f}",
                itemId, itemName, quantity, pricePerUnit);
    }
}

class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    // Add item (if present, increase quantity)
    public void addItem(CartItem item) {
        if (items.contains(item)) {
            int idx = items.indexOf(item);
            CartItem existing = items.get(idx);
            existing.quantity += item.quantity;
            System.out.println("Increased quantity of itemId " + item.itemId + " to " + existing.quantity);
        } else {
            items.add(item);
            System.out.println("Added: " + item);
        }
    }

    // Remove by itemId
    public boolean removeItem(int itemId) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemId == itemId) {
                System.out.println("Removed: " + items.get(i));
                items.remove(i);
                return true;
            }
        }
        System.out.println("Item " + itemId + " not found.");
        return false;
    }

    // Update quantity
    public boolean updateQuantity(int itemId, int newQuantity) {
        for (CartItem ci : items) {
            if (ci.itemId == itemId) {
                ci.quantity = newQuantity;
                System.out.println("Updated: " + ci);
                return true;
            }
        }
        System.out.println("Item " + itemId + " not found.");
        return false;
    }

    // Search
    public CartItem searchItem(int itemId) {
        CartItem probe = new CartItem(itemId, "", 0, 0.0);
        int idx = items.indexOf(probe);
        return (idx >= 0) ? items.get(idx) : null;
    }

    // Total bill
    public double getTotalBill() {
        double total = 0.0;
        for (CartItem ci : items) total += ci.quantity * ci.pricePerUnit;
        return total;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        items.forEach(System.out::println);
        System.out.printf("Total: %.2f%n", getTotalBill());
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem(10, "USB Cable", 2, 5.00));
        cart.addItem(new CartItem(11, "Mouse", 1, 25.00));
        cart.addItem(new CartItem(10, "USB Cable", 1, 5.00)); // should increase qty for itemId 10

        System.out.println("\nCart contents:");
        cart.displayCart();

        System.out.println("\nSearching for itemId 11:");
        CartItem found = cart.searchItem(11);
        System.out.println(found != null ? "Found: " + found : "Not found");

        System.out.println("\nUpdating quantity of itemId 10 to 5:");
        cart.updateQuantity(10, 5);
        cart.displayCart();

        System.out.println("\nRemoving itemId 11:");
        cart.removeItem(11);
        cart.displayCart();
    }
}
