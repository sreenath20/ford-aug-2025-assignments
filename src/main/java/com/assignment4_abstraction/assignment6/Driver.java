package com.assignment4_abstraction.assignment6;

public class Driver {
    public static void main(String[] args) {
        Pizza pizza=new Pizza("Margherita", 5);

        pizza.prepare();
        pizza.deliver(5);

        Burger burger=new Burger("Cheeseburger", 10);
        burger.prepare();
        burger.deliver(10);
    }
}
