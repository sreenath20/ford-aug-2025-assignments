package assignment_09.product_price_catalog;

public class Product {
    int productId;
    String name;
    double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: Rs." + price);
    }
}
