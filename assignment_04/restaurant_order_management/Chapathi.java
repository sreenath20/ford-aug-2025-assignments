package assignment_04.restaurant_order_management;

public class Chapathi extends MenuItem implements Deliverable {
    public Chapathi(String itemName){
        super(itemName);
    }

    @Override
    public void prepare(){
        System.out.println("Preparing "+ getItemName());
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering "+ getItemName() + " to table " + tableNumber);
    }
}
