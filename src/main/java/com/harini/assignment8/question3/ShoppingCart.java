package com.harini.assignment8.question3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartList;
    public ShoppingCart(){
        this.cartList= new ArrayList<>();
    }
    public void add(CartItem item){
        for(CartItem item1:cartList){
            if(item1.equals(item)){
                item1.quantity= item.quantity+1;
                System.out.println("Item added successfully");
                return;
            }
        }
        cartList.add(item);
        System.out.println("Item added successfully");

    }
    public void removeItem(Integer itemId){
        for(CartItem item:cartList){
            if(item.itemId.equals(itemId)){
                cartList.remove(item);
                System.out.println("Item removed from the cart");
                break;
            }
        }

    }
    public void updateItem(Integer itemId, Integer newQuantity){
        for(CartItem item:cartList){
            if(item.itemId.equals(itemId)){
                item.quantity=newQuantity;
            }
        }

    }
    public boolean searchItem(Integer itemId){
        for(CartItem item:cartList){
            if(item.itemId.equals(itemId)){
                return true;
            }
        }
        return false;
    }
    public Double getTotalBill(){
        Double total=0.0;
        for(CartItem item:cartList){
            total+=(item.pricePerUnit*item.quantity);
        }
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartList=" + cartList +
                '}';
    }

    public static void main(String[] args) {
        ShoppingCart cartList = new ShoppingCart();
        CartItem item1 = new CartItem(1,"Bag",1,800.0);
        CartItem item2 = new CartItem(2,"Purse",1,250.9);
        CartItem item3 = new CartItem(3,"Slipper",1,345.8);
        CartItem item4 = new CartItem(4,"Shoe",1,1200.0);
        CartItem item5 = new CartItem(5,"Hand Bag",1,880.0);
        CartItem item6 = new CartItem(2,"Purse",1,250.9);
        cartList.add(item1);
        cartList.add(item2);
        cartList.add(item3);
        cartList.add(item4);
        cartList.add(item5);
        cartList.add(item6);
        System.out.println(cartList);
        cartList.removeItem(item3.itemId);
        cartList.updateItem(item4.itemId, 4);
        System.out.println(cartList.searchItem(item3.itemId));
        System.out.println(cartList);
        System.out.println(cartList.getTotalBill());


    }
}
