package Assignment4.RestaurantOrderManagement;

public class Burger extends MenuItem implements Deliverable {

    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + itemName + ": bun, patty, lettuce, sauces.");
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println(itemName + " delivered to table " + tableNumber);
    }
}

