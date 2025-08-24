package com.harini.assignment3.Question8;

public class Main {
    public static void main(String[] args) {
        MenuItem veg1 = new Veg("Salad",120.8, "Vegetarian",20,"Medium");
        MenuItem nonveg1 = new NonVeg("Dragon Chicken",145.98,"Non-Veg",50,"High");
        MenuItem veg2 = new Veg("Paneer Fry",110.8, "Vegetarian",15,"Medium");
        MenuItem nonveg2 = new NonVeg("Chicken Biriyani",245.98,"Non-Veg",80,"Medium");
        MenuItem nonveg3 = new NonVeg("Fish Fingers",180.98,"Non-Veg",35,"Low");
        Orders orders = new Orders();
        orders.addItem(veg1);
        orders.addItem(nonveg1);
        orders.addItem(veg2);
        orders.addItem(nonveg2);
        orders.addItem(nonveg3);
        orders.displayOrders();
        System.out.println("The totalprice of the entire order is "+orders.totalPrice());

    }
}
