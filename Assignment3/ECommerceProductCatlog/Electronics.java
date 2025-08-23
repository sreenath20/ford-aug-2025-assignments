package Assignment3.ECommerceProductCatlog;

public class Electronics extends Product {
    private int warrantyPeriod; // in months

    public Electronics(String productId, String name, double price, String description, int warrantyPeriod) {
        super(productId, name, price, description);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}
