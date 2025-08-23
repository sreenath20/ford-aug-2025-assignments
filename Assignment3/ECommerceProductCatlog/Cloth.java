package Assignment3.ECommerceProductCatlog;

public class Cloth extends Product {
    private String size;
    private String fabric;

    public Cloth(String productId, String name, double price, String description, String size, String fabric) {
        super(productId, name, price, description);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}
