package day3.Assignment3;

public class Product {
    private int productId;
    private String name;
    private double price;
    private String description;

    public Product(int productId, String name, double price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId +
                ", Name: " + name +
                ", Price: ₹" + price +
                ", Description: " + description);
    }

}
