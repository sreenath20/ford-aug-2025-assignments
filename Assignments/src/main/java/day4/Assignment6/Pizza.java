package day4.Assignment6;

public class Pizza extends MenuItem implements Deliverable {

    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Pizza to table "+tableNumber);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza: "+itemName);
    }
}
