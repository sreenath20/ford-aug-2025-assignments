package com.harini.assignment4.Question6;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margherita");
        pizza.prepare();
        pizza.deliver(5);
        Burger burger = new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(10);
    }
}
