package Assignment3.OnlineFoodDeliverySystem;

public class Driver {
    public static void main(String[] args) {
        VegItem vegBurger = new VegItem("Veg Burger", 4.99, "Veg", 250, "Medium");
        NonVegItem chickenPizza = new NonVegItem("Chicken Pizza", 9.99, "Non-Veg", 600, "High");

        Order order = new Order();
        order.addItem(vegBurger);
        order.addItem(chickenPizza);

        order.displayOrder();
    }
}
