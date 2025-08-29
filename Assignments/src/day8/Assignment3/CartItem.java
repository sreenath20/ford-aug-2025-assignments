package day8.Assignment3;

import java.util.Objects;

public class CartItem {
    Integer itemId;
    String itemName;
    Integer quantity;
    Double pricePerUnit;
    public CartItem(Integer itemId, String itemName, Integer quantity, Double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(itemId, cartItem.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemId);
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
