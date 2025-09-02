package assignment_08.online_shopping_system;

import java.util.Objects;

public class CartItem {
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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        CartItem other = (CartItem) obj;
        return itemId == other.itemId;
    }

    public int hashCode() {
        return Objects.hash(itemId);
    }

    public String toString() {
        return "Item ID: " + itemId + ", Name: " + itemName + ", Quantity: " + quantity + ", Price: Rs." + pricePerUnit;
    }

    public void displayItem() {
        System.out.println("ID: " + itemId + ", Name: " + itemName + ", Qty: " + quantity + ", Price: Rs." + pricePerUnit + ", Total: Rs." + (quantity * pricePerUnit));
    }
}
