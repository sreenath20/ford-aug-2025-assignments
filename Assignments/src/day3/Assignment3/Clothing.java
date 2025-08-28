package day3.Assignment3;

public class Clothing extends Product{
    private String size;
    private String fabric;

    public Clothing(int productId, String name, double price, String description, String size, String fabric) {
        super(productId, name, price, description);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() { return size; }
    public String getFabric() { return fabric; }
    public void setSize(String size) { this.size = size; }
    public void setFabric(String fabric) { this.fabric = fabric; }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Clothing, Size: " + size + ", Fabric: " + fabric);
    }
}
