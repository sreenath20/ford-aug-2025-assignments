package day3.Assignment3;
import java.time.LocalDate;
public class Groceries extends Product{
    private LocalDate expiryDate;

    public Groceries(int productId, String name, double price, String description, LocalDate expiryDate) {
        super(productId, name, price, description);
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Groceries, Expiry Date: " + expiryDate);
    }
}
