package assignment_03.ecommerce_product_catalog;

public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(String productId, String name, double price, String info, int warrantyPeriod) {
        super(productId, name, price, info);
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
        System.out.println("Category: Electronics");
        System.out.println("Warranty Period: " + warrantyPeriod + " months");

    }
}
