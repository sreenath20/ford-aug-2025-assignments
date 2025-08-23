package Assignment4.RestaurantOrderManagement;

public class Driver {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Chicken Pizza");
        pizza.prepare();
        pizza.deliver(5);

        System.out.println();

        Burger burger = new Burger("Veg Burger");
        burger.prepare();
        burger.deliver(3);
    }
}

