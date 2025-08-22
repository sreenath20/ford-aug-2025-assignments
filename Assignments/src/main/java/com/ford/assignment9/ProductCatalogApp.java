package com.ford.assignment9;


import java.util.*;

class Product {
    private int productId;
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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

class ProductCatalog {
    private Map<Integer, Product> catalog = new HashMap<>();

    // Add a new product
    public void addProduct(Product product) {
        catalog.put(product.getProductId(), product);
    }

    // Remove a product
    public void removeProduct(int productId) {
        catalog.remove(productId);
    }

    // Update price
    public boolean updatePrice(int productId, double newPrice) {
        Product product = catalog.get(productId);
        if (product != null) {
            product.setPrice(newPrice);
            return true;
        }
        return false;
    }

    // View all products

    public void viewAllProducts() {
        catalog.values().forEach(System.out::println);
    }


    // Find by ID
public Product findById(int productId) {
    return catalog.get(productId);
}

// Find products cheaper than a given price
public List<Product> findCheaperThan(double priceLimit) {
    List<Product> result = new ArrayList<>();
    for (Product product : catalog.values()) {
        if (product.getPrice() < priceLimit) {
            result.add(product);
        }
    }
    return result;
}

// Sort by name
public List<Product> sortByName() {
    List<Product> sorted = new ArrayList<>(catalog.values());
    sorted.sort(Comparator.comparing(Product::getName));
    return sorted;
}

// Sort by price ascending
public List<Product> sortByPriceAscending() {
    List<Product> sorted = new ArrayList<>(catalog.values());
    sorted.sort(Comparator.comparingDouble(Product::getPrice));
    return sorted;
}

// Sort by price descending
public List<Product> sortByPriceDescending() {
    List<Product> sorted = new ArrayList<>(catalog.values());
    sorted.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    return sorted;
}
}

public class ProductCatalogApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product(101, "Laptop", 75000));
        catalog.addProduct(new Product(102, "Smartphone", 25000));
        catalog.addProduct(new Product(103, "Headphones", 1500));
        catalog.addProduct(new Product(104, "Monitor", 12000));

        System.out.println("All Products:");
        catalog.viewAllProducts();

        System.out.println("\nFind Product by ID (102):");
        System.out.println(catalog.findById(102));

        System.out.println("\nProducts cheaper than ₹20000:");
        catalog.findCheaperThan(20000).forEach(System.out::println);

        System.out.println("\nProducts sorted by Name:");
        catalog.sortByName().forEach(System.out::println);

        System.out.println("\nProducts sorted by Price (Ascending):");
        catalog.sortByPriceAscending().forEach(System.out::println);

        System.out.println("\nProducts sorted by Price (Descending):");
        catalog.sortByPriceDescending().forEach(System.out::println);

        System.out.println("\nUpdating price of Product ID 103 to ₹1800");
        catalog.updatePrice(103, 1800);

        System.out.println("\nRemoving Product ID 101");
        catalog.removeProduct(101);

        System.out.println("\nFinal Product List:");
        catalog.viewAllProducts();
    }
}
