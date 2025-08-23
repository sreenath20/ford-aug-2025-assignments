package Assignment8.onlineshoppingcart;

import java.util.Objects;

public class CartItem {
    private int itemId;
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public CartItem() {}

    public CartItem(int itemId, String itemName, int quantity, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != CartItem.class) {
            return false;
        }
        CartItem item = (CartItem) o;
        return this.itemId == item.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemId);
    }
}

