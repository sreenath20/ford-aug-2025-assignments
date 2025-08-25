package assignment_04.restaurant_order_management;

public class Restaurant_Order_Management {
    public static void main(String[] args) {
        System.out.println("\nRestaurant Order Management\n");

        Dosa dosa1=new Dosa("Podi Dosa");
        Dosa dosa2=new Dosa("Rava Dosa");
        Chapathi chapathi=new Chapathi("Aloo Chapathi");

        dosa1.prepare();
        dosa2.prepare();
        chapathi.prepare();
        System.out.println("");

        dosa1.deliver(8);
        dosa2.deliver(2);
        chapathi.deliver(2);
    }
}
