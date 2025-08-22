package assignment_03.ecommerce_product_catalog;

class Product {
    private String productId;
    private String name;
    private double price;
    private String description;

    public Product(String productId, String name, double price, String info) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = info;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayProductDetails() {
        //System.out.println("Product Details : ");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
}
