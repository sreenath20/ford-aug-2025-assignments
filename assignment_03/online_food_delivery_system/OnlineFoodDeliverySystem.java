package assignment_03.online_food_delivery_system;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Online Food Delivery System! \n");

        System.out.println("------ Menu -------");

        VegItem vegBurger = new VegItem("Paneer Burger", 137.9, 390, "Mild");
        VegItem vegPizza = new VegItem("Margherita Pizza", 379, 420, "Medium");
        VegItem vegPasta = new VegItem("White sauce Pasta", 260, 380, "Low");

        vegBurger.displayItem();
        vegPizza.displayItem();
        vegPasta.displayItem();

        NonVegItem chickenBurger = new NonVegItem("FriedChicken Burger", 230.50, 480, "Medium");
        NonVegItem chickenPizza = new NonVegItem("Chicken Pizza", 569.99, 550, "High");
        NonVegItem fishCurry = new NonVegItem("Fish Curry", 195.60, 320, "High");

        chickenBurger.displayItem();
        chickenPizza.displayItem();
        fishCurry.displayItem();
        System.out.println();

        System.out.println("--- Creating Customer Orders ---");
        Order order1 = new Order("Abhira Sharma", 101);
        Order order2 = new Order("Armaan Poddar", 102);

        System.out.println(" Order 1: Abhira's Order ");
        order1.addItem(vegPizza);
        order1.addItem(chickenBurger);
        System.out.println();

        System.out.println(" Order 2: Armaan's Order");
        order2.addItem(chickenPizza);
        order2.addItem(vegPasta);
        System.out.println();

        System.out.println("--- Order Summaries ---");
        order1.displayOrder();
        System.out.println();
        order2.displayOrder();
        System.out.println();

        double totalBusiness = order1.calculateTotalBill() + order2.calculateTotalBill();
        System.out.println("Total business today: Rs." + totalBusiness);

    }
}
