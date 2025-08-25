package assignment_03.ecommerce_product_catalog;

public class Clothing extends Product{
    private String size;
    private String fabric;

    public Clothing(String productId, String name, double price, String info, String size, String fabric) {
        super(productId, name, price, info);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Clothing");
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);

    }
}
