
abstract class MenuItem {
    protected String itemName;

    protected MenuItem(String itemName) {
        this.itemName = itemName;
    }

    abstract void prepare();
}

interface Deliverable {
    void deliver(int tableNumber);
}

class Pizza extends MenuItem implements Deliverable {
    public Pizza(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Pizza: " + itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Pizza to table " + tableNumber);
    }
}

class Burger extends MenuItem implements Deliverable {
    public Burger(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Burger: " + itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Burger to table " + tableNumber);
    }
}

public class RestaurantOrderManagement {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margherita");
        pizza.prepare();
        pizza.deliver(5);

        Burger burger = new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(2);
    }
}
