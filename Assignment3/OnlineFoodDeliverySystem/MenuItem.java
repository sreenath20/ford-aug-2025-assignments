package Assignment3.OnlineFoodDeliverySystem;

public class MenuItem {
    protected String name;
    protected double price;
    protected String type;

    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void displayItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rs" + price);
        System.out.println("Type: " + type);
    }

    public double getPrice() {
        return price;
    }
}
