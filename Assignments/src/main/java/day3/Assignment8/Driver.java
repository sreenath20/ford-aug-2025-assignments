package day3.Assignment8;

public class Driver {
    public static void main(String[] args) {
        MenuItem veg1 = new Veg("Salad",100.00, "Vegetarian",20,"Low");
        MenuItem nonveg1 = new NonVeg("Chicken Noodles",150.00,"Non-Veg",100,"High");
        MenuItem veg2 = new Veg("Paneer Fry",120.00, "Vegetarian",80,"Medium");
        MenuItem nonveg2 = new NonVeg("Chicken Biryani",250.00,"Non-Veg",150,"Medium");
        MenuItem nonveg3 = new NonVeg("Fish Fry",180.00,"Non-Veg",90,"High");
        Orders orders = new Orders();
        orders.addItem(veg1);
        orders.addItem(nonveg1);
        orders.addItem(veg2);
        orders.addItem(nonveg2);
        orders.addItem(nonveg3);
        orders.displayOrders();
        System.out.println("The total price of the entire order is "+orders.totalPrice());

    }
}
