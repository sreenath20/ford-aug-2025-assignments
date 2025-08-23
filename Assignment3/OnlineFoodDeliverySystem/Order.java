package Assignment3.OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayOrder() {
        double total = 0;
        System.out.println("----- Order Details -----");
        for (MenuItem item : items) {
            item.displayItem();
            System.out.println();
            total += item.getPrice();
        }
        System.out.println("Total Bill: Rs" + total);
    }
}
