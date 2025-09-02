package assignment_09.product_price_catalog;

import java.util.*;

public class ProductPriceCatalog {
    private static HashMap<Integer, Product> products = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nProduct Price Catalog System\n");

        // Pre-adding some products
        products.put(101, new Product(101, "Basmati Rice", 150.0));
        products.put(102, new Product(102, "Tata Salt", 25.0));
        products.put(103, new Product(103, "Amul Butter", 45.0));
        products.put(104, new Product(104, "Maggi Noodles", 15.0));

        while (true) {
            System.out.println("\n1. Add  2. Remove  3. Update Price  4. View All  5. Search  6. Sort  7. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: removeProduct(); break;
                case 3: updatePrice(); break;
                case 4: viewAllProducts(); break;
                case 5: searchMenu(); break;
                case 6: sortMenu(); break;
                case 7: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (products.containsKey(id)) {
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: Rs.");
        double price = scanner.nextDouble();

        products.put(id, new Product(id, name, price));
        System.out.println("Product added!");
    }

    private static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = scanner.nextInt();

        if (products.remove(id) != null) {
            System.out.println("Product removed!");
        } else {
            System.out.println("Product not found!");
        }
    }

    private static void updatePrice() {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();

        Product product = products.get(id);
        if (product != null) {
            System.out.print("New Price: Rs.");
            product.price = scanner.nextDouble();
            System.out.println("Price updated!");
        } else {
            System.out.println("Product not found!");
        }
    }

    private static void viewAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products!");
            return;
        }

        System.out.println("\nAll Products:");
        int count = 1;
        for (Product product : products.values()) {
            System.out.print(count + ". ");
            product.displayProduct();
            count++;
        }
    }

    private static void searchMenu() {
        System.out.println("\n1. Search by ID  2. Search by Price Range");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: searchById(); break;
            case 2: searchByPrice(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void searchById() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();

        Product product = products.get(id);
        if (product != null) {
            System.out.println("Found:");
            product.displayProduct();
        } else {
            System.out.println("Product not found!");
        }
    }

    private static void searchByPrice() {
        System.out.print("Enter maximum price: Rs.");
        double maxPrice = scanner.nextDouble();

        boolean found = false;
        System.out.println("Products cheaper than Rs." + maxPrice + ":");
        for (Product product : products.values()) {
            if (product.price < maxPrice) {
                product.displayProduct();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found in this price range!");
        }
    }

    private static void sortMenu() {
        System.out.println("\n1. Sort by Name  2. Sort by Price (Low to High)  3. Sort by Price (High to Low)");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        ArrayList<Product> sortedList = new ArrayList<>(products.values());

        switch (choice) {
            case 1:
                Collections.sort(sortedList, new NameComparator());
                System.out.println("Sorted by Name:");
                break;
            case 2:
                Collections.sort(sortedList, new PriceComparator());
                System.out.println("Sorted by Price (Low to High):");
                break;
            case 3:
                Collections.sort(sortedList, new PriceComparator().reversed());
                System.out.println("Sorted by Price (High to Low):");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        int count = 1;
        for (Product product : sortedList) {
            System.out.print(count + ". ");
            product.displayProduct();
            count++;
        }
    }
}
