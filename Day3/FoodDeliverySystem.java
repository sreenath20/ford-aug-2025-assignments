import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;
    private String type; // e.g., "veg", "non-veg"
    public MenuItem(String name, double price, String type) {
        this.name = name; this.price = price; this.type = type;
    }
    public double getPrice() { return price; }
    public String getName() { return name; }
    public void displayItem() {
        System.out.println(name + " (" + type + ") - $" + price);
    }
}

class VegItem extends MenuItem {
    private int calories;
    private int spiceLevel;
    public VegItem(String name, double price, int calories, int spiceLevel) {
        super(name, price, "veg");
        this.calories = calories; this.spiceLevel = spiceLevel;
    }
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("  Calories: " + calories + ", Spice: " + spiceLevel);
    }
}

class NonVegItem extends MenuItem {
    private int calories;
    private int spiceLevel;
    public NonVegItem(String name, double price, int calories, int spiceLevel) {
        super(name, price, "non-veg");
        this.calories = calories; this.spiceLevel = spiceLevel;
    }
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("  Calories: " + calories + ", Spice: " + spiceLevel);
    }
}

class Order {
    private List<MenuItem> items = new ArrayList<>();
    public void addItem(MenuItem item) { items.add(item); }
    public double computeTotal() {
        double total = 0.0;
        for (MenuItem item : items) total += item.getPrice();
        return total;
    }
    public void printOrder() {
        System.out.println("Order details:");
        for (MenuItem i : items) i.displayItem();
        System.out.println("Total: $" + computeTotal());
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new VegItem("Paneer Butter Masala", 12.0, 450, 2));
        order.addItem(new NonVegItem("Chicken Biryani", 14.5, 700, 3));

        order.printOrder();
    }
}

