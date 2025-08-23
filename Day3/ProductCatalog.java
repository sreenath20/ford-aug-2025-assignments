import java.time.LocalDate;

class Product {
    private String productId;
    private String name;
    private double price;
    private String description;

    public Product(String productId, String name, double price, String description) {
        this.productId = productId; this.name = name; this.price = price; this.description = description;
    }
    public void displayProductDetails() {
        System.out.println(name + " (" + productId + ") - $" + price + " : " + description);
    }
}

class Electronics extends Product {
    private int warrantyPeriodMonths;
    public Electronics(String id, String name, double price, String desc, int warrantyMonths) {
        super(id, name, price, desc);
        this.warrantyPeriodMonths = warrantyMonths;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("  Warranty: " + warrantyPeriodMonths + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String fabric;
    public Clothing(String id, String name, double price, String desc, String size, String fabric) {
        super(id, name, price, desc);
        this.size = size; this.fabric = fabric;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("  Size: " + size + ", Fabric: " + fabric);
    }
}

class Groceries extends Product {
    private LocalDate expiryDate;
    public Groceries(String id, String name, double price, String desc, LocalDate expiryDate) {
        super(id, name, price, desc);
        this.expiryDate = expiryDate;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("  Expires: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] catalog = {
                new Electronics("E100","Smartphone",699.99,"Flagship phone",24),
                new Clothing("C200","T-Shirt",19.99,"100% cotton", "L","Cotton"),
                new Groceries("G300","Milk",2.99,"1L whole milk", LocalDate.now().plusDays(7))
        };
        for (Product p : catalog) p.displayProductDetails();
    }
}
