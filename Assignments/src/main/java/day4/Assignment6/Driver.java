package day4.Assignment6;

public class Driver {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margherita");
        pizza.prepare();
        pizza.deliver(5);
        System.out.println();
        Burger burger = new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(10);
    }
}
