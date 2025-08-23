package Assignment8.onlineshoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addItem(CartItem newItem) {
        int index = cartItems.indexOf(newItem);
        if (index != -1) {
            CartItem existingItem = cartItems.get(index);
            existingItem.setQuantity(existingItem.getQuantity() + newItem.getQuantity());
        } else {
            cartItems.add(newItem);
        }
    }

    public void removeItem(int itemId) {
        cartItems.removeIf(item -> item.getItemId() == itemId);
    }

    public void updateQuantity(int itemId, int newQuantity) {
        for (CartItem item : cartItems) {
            if (item.getItemId() == itemId) {
                item.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public CartItem searchItem(int itemId) {
        for (CartItem item : cartItems) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    public double getTotalBill() {
        double total = 0.0;
        for (CartItem item : cartItems) {
            total += item.getQuantity() * item.getPricePerUnit();
        }
        return total;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}

