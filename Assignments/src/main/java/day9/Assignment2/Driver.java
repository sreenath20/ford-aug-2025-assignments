package day9.Assignment2;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Map<Integer, Product> catalog = new HashMap<>();

        // Add products
        catalog.put(101, new Product("ABC", 5000.00, 101));
        catalog.put(102, new Product("DEF", 300.00, 102));
        catalog.put(103, new Product("GHI", 2500.00, 103));
        catalog.put(104, new Product("JKL", 50.00, 104));

        System.out.println("All Products:");
        displayCatalog(catalog);

        // Remove product
        catalog.remove(103);
        System.out.println("\nAfter Removing Product ID 103:");
        displayCatalog(catalog);

        // Update price of a product
        if (catalog.containsKey(101)) {
            catalog.get(101).setPrice(5500.00);
        }
        System.out.println("\nAfter Updating Price of Product ID 101:");
        displayCatalog(catalog);

        // Search by ID
        int searchId = 104;
        System.out.println("\nSearching for Product ID " + searchId + ":");
        if (catalog.containsKey(searchId)) {
            System.out.println(catalog.get(searchId));
        } else {
            System.out.println("Product not found.");
        }

        // Find all products cheaper than a given price
        double limit = 1000.00;
        System.out.println("\nProducts cheaper than ₹" + limit + ":");
        for (Product p : catalog.values()) {
            if (p.getPrice() < limit) {
                System.out.println(p);
            }
        }

        // Sorting by name
        List<Product> list = new ArrayList<>(catalog.values());
        list.sort(new ProductNameComparator());
        System.out.println("\nProducts Sorted by Name:");
        displayList(list);

        // Sorting by price ascending
        list.sort(new ProductPriceComparator());
        System.out.println("\nProducts Sorted by Price (Ascending):");
        displayList(list);

        // Sorting by price descending
        list.sort(new P_PriceDescComparator());
        System.out.println("\nProducts Sorted by Price (Descending):");
        displayList(list);
    }

    public static void displayCatalog(Map<Integer, Product> catalog) {
        for (Map.Entry<Integer, Product> entry : catalog.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void displayList(List<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }



    }
}
