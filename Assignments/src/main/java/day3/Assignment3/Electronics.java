package day3.Assignment3;

public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(int productId, String name, double price, String description, int warrantyPeriod) {
        super(productId, name, price, description);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Electronics, Warranty: " + warrantyPeriod + " months");
    }
}
