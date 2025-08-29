import java.util.ArrayList;

public class Order extends MenuItem{
    private ArrayList<MenuItem> items ;

    public Order() {
        items = new ArrayList<>();
    }
    public void addItem(MenuItem item){
        items.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(MenuItem item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void displayOrder(){
        for (MenuItem item : items){
            item.displayItem();
        }
        System.out.println("========================");
        System.out.println("       ORDER BILL       ");
        System.out.println("========================");
        System.out.println("Total Items: " + items.size());
        System.out.printf("Total Amount: ₹%.2f\n", getTotalPrice());
        System.out.println("========================");
    }

}
