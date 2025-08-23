package Assignment3.ECommerceProductCatlog;

import java.time.LocalDate;

public class Groceries extends Product {
    private LocalDate expiryDate;

    public Groceries(String productId, String name, double price, String description, LocalDate expiryDate) {
        super(productId, name, price, description);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
