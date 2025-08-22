package com.assignments.assignment8;

import java.util.List;
import java.util.Objects;

public class CartItem {

    Integer itemId;
    String itemName;
    Integer quantity;
    Double pricePerUnit;

    public CartItem() {}
    public CartItem(Integer itemId){
        this.itemId = itemId;
        itemName = null;
        quantity = null;
        pricePerUnit = null;
    }
    public CartItem(Integer itemId, String itemName, Integer quantity, Double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
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
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(itemId, cartItem.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemId);
    }

    void addItem(List<CartItem> itemsList,CartItem cartItem){
        if(itemsList.contains(cartItem)){
            int index=itemsList.indexOf(cartItem);
            CartItem inListItem = itemsList.get(index);
            inListItem.quantity += cartItem.quantity;
            System.out.println("Item exist in cart & quantity incremented...");
        }
        else {
            itemsList.add(cartItem);
            System.out.println("Item added in cart...");
        }
    }

    void removeItem(List<CartItem> itemsList,CartItem cartItem){
        itemsList.remove(cartItem);
    }
    void updateQuantity(List<CartItem> itemsList,Integer itemId,int newQuantity){
        if(itemsList.contains(new CartItem(itemId))){

            int indexOfItem = itemsList.indexOf(new CartItem(itemId));
            CartItem inListItem = itemsList.get(indexOfItem);
            inListItem.quantity = newQuantity;
            System.out.println("Item quantity updated ...");

        }
    }
    void searchItem(List<CartItem> itemsList,Integer itemId){
        if(itemsList.contains(new CartItem(itemId))){
            System.out.println("Item id "+itemId+" exist in index : "+itemsList.indexOf(new CartItem(itemId)));
        }
        else System.out.println("Item not found in cart");
    }

    void getTotalBill(List<CartItem> itemsList){
        double totalBill = 0;
        for(CartItem c : itemsList){
            System.out.println(c.itemName + " Nos : "+c.quantity+ " Price : Rs."+(c.quantity*c.pricePerUnit));
            totalBill += c.quantity*c.pricePerUnit;
        }
        System.out.println("--->   Total Bill : Rs."+totalBill);
    }

    void displayCartItems(List<CartItem> itemsList){
        for(CartItem c : itemsList){
            System.out.println(c);
        }
    }
}
