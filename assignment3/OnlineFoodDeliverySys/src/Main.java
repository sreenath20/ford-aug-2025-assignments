//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create an order
        Order order = new Order();

        // Create and add Veg and Non-Veg items
        VegItem veg1 = new VegItem("Paneer Butter Masala", 500, "veg", 200,"mild");
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 320.0, "nonveg", 250,"spicy");
        VegItem veg2 = new VegItem("Veg Pulao", 180.0, "veg", 230,"not spicy");

        order.addItem(veg1);
        order.addItem(nonVeg1);
        order.addItem(veg2);

        // Display the full order
        order.displayOrder();
    }
}