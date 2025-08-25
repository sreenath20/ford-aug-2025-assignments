package assignment_03.ecommerce_product_catalog;

public class Groceries extends Product{
    private String expiryDate;

    public Groceries(String productId, String name, double price, String description, String expiryDate) {
        super(productId, name, price, description);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Groceries");
        System.out.println("Expiry Date: " + expiryDate);
    }
}
