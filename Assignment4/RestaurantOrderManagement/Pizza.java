package Assignment4.RestaurantOrderManagement;

public class Pizza extends MenuItem implements Deliverable {

    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + itemName + ": dough, sauce, cheese, toppings.");
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println(itemName + " delivered to table " + tableNumber);
    }
}

