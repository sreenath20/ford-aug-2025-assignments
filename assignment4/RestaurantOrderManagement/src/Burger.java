public class Burger extends MenuItem implements Deliverable {
    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Deliver "+itemName+" to table Number " + tableNumber);
    }

    @Override
    public void prepare() {
        System.out.println("preparing: "+itemName);

    }


}
