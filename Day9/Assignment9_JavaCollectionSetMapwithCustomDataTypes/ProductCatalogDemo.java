package Assignment9_JavaCollectionSetMapwithCustomDataTypes;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private final int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product{id=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class ProductCatalog {
    private final Map<Integer, Product> products = new HashMap<>();

    // Add a new product. Returns false if productId already exists
    public boolean add(Product p) {
        return products.putIfAbsent(p.getProductId(), p) == null;
    }

    // Remove a product by id
    public Product remove(int productId) {
        return products.remove(productId);
    }

    // Update price
    public boolean updatePrice(int productId, double newPrice) {
        Product p = products.get(productId);
        if (p == null) return false;
        p.setPrice(newPrice);
        return true;
    }

    // View all
    public List<Product> viewAll() {
        return new ArrayList<>(products.values());
    }

    // Find by id
    public Optional<Product> findById(int productId) {
        return Optional.ofNullable(products.get(productId));
    }

    // Find all products cheaper than price
    public List<Product> findCheaperThan(double price) {
        return products.values().stream()
                .filter(p -> p.getPrice() < price)
                .collect(Collectors.toList());
    }

    // Sorted by product name
    public List<Product> sortedByName() {
        return products.values().stream()
                .sorted(Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Sorted by price ascending
    public List<Product> sortedByPrice(boolean ascending) {
        return products.values().stream()
                .sorted(ascending
                        ? Comparator.comparingDouble(Product::getPrice)
                        : Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }
}

class ProductCatalogDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        catalog.add(new Product(101, "Mouse", 19.99));
        catalog.add(new Product(102, "Keyboard", 49.99));
        catalog.add(new Product(103, "Monitor", 199.99));
        catalog.add(new Product(104, "USB Cable", 5.49));

        System.out.println("All products: " + catalog.viewAll());
        System.out.println("Find 102: " + catalog.findById(102));
        System.out.println("Cheaper than 50: " + catalog.findCheaperThan(50.0));
        System.out.println("Sorted by name: " + catalog.sortedByName());
        System.out.println("Sorted by price desc: " + catalog.sortedByPrice(false));

        catalog.updatePrice(103, 179.99);
        System.out.println("After update price 103: " + catalog.findById(103));
        catalog.remove(104);
        System.out.println("After removing 104: " + catalog.viewAll());
    }
}

