
package com.assignment8_collections.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<CartItem> cartlist = new ArrayList();
        cartlist.add(new CartItem(4, "banana", 2, (double)0.5F));
        cartlist.add(new CartItem(2, "Apple", 3, (double)0.5F));
        cartlist.add(new CartItem(3, "Orange", 1, 0.8));
        cartlist.add(new CartItem(1, "Watermelon", 2, 0.9));
        System.out.println("Initial cartlist " + String.valueOf(cartlist));
        System.out.println();
        System.out.println("sorting cartlist by item name");
        Collections.sort(cartlist);
        System.out.println();
        CartItem item1 = new CartItem(2, "Apple", 2, 0.8);
        System.out.println("updating the quantity of item 2  in the cartlist " + String.valueOf(item1));

        for(CartItem item : cartlist) {
            if (item.getItemId().equals(item1.getItemId())) {
                item.addquantity(item1.getQuantity());
                System.out.println("updated item " + String.valueOf(item));
            }
        }

        System.out.println("Final cartlist after updating quantity: " + String.valueOf(cartlist));
        System.out.println();
        System.out.println("remove elemnets by item id 3 ");

        for(CartItem item : cartlist) {
            if (item.getItemId().equals(3)) {
                cartlist.remove(item);
                System.out.println("deleted item " + String.valueOf(item));
            }
        }

        System.out.println("Final cartlist after removal quantity: " + String.valueOf(cartlist));
        System.out.println();
        System.out.println("Update quantity by item id ");
        System.out.println("enter the item id to update quantity");
        Integer itemid = input.nextInt();
        System.out.println("enter the quantity to update");
        Integer quantity = input.nextInt();

        for(CartItem item : cartlist) {
            if (item.getItemId().equals(itemid)) {
                item.updateQuantity(itemid, quantity);
                System.out.println("updated item " + String.valueOf(item));
            }
        }

        System.out.println("Final cartlist after update quantity: " + String.valueOf(cartlist));
        System.out.println();
        System.out.println("enter the item id to find the item");
        Integer findItemId = input.nextInt();
        boolean found = false;

        for(CartItem item : cartlist) {
            if (item.getItemId().equals(findItemId)) {
                System.out.println("item found " + String.valueOf(item));
                found = true;
            }
        }

        if (!found) {
            System.out.println("item not found with id " + findItemId);
        }

        System.out.println();
        List<CartItem> cartlist1 = new ArrayList();
        cartlist1.add(new CartItem(10, "grapes", 2, (double)50.0F));
        cartlist1.add(new CartItem(11, "pipeapple", 3, (double)25.0F));
        System.out.println("calculate total bill amount for cartlist1 " + String.valueOf(cartlist1));
        Double totalBill = (double)0.0F;

        for(CartItem item : cartlist1) {
            Double total = item.getTotalBill();
            totalBill = totalBill + total;
        }

        System.out.println("Total bill  for item in tha cart " + totalBill);
    }
}