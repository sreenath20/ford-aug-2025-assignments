public class Pizza extends MenuItem implements Deliverable {

    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    public void deliver(int tableNumber) {
    System.out.println("deliver"+itemName+" to table number " + tableNumber);
    }

    @Override
    public void prepare() {
        System.out.println("preparing: "+itemName);
    }
}

