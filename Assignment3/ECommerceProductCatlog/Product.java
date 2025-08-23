package Assignment3.ECommerceProductCatlog;

public class Product {
    private String productId;
    private String name;
    private double price;
    private String description;

    public Product(String productId, String name, double price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }
}
