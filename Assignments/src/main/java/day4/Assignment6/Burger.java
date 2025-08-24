package day4.Assignment6;

public class Burger extends MenuItem implements Deliverable {
    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Burger to table "+tableNumber);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger: "+itemName);
    }
}
