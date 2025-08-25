package assignment_03.ecommerce_product_catalog;

public class ECommerceProductCatalog {
    public static void main(String[] args) {
        System.out.println("Welcome to E-Commerce Product Catalog! \n");

        // Create Electronics product
        System.out.println("--- Electronics Product ---");
        Electronics laptop = new Electronics("EL01", "Electric Fan", 1299.99, "High-performance FAN with led lights", 24);
        laptop.displayProductDetails();
        System.out.println();

        // Create Clothing product
        System.out.println("--- Clothing Product ---");
        Clothing shirt = new Clothing("CL01", "Cotton T-Shirt", 499.0, "Comfortable cotton t-shirt", "Medium", "100% Cotton");
        shirt.displayProductDetails();
        System.out.println();

        // Create Groceries product
        System.out.println("--- Grocery Product ---");
        Groceries milk = new Groceries("GR01", "Milk", 36.50, "Fresh organic whole milk", "2025-08-16");
        milk.displayProductDetails();
        System.out.println();

        // Create more products to show variety
        System.out.println("--- More Products in Catalog ---");

        Electronics phone = new Electronics("EL02", "Smartphone", 27800.00, "Latest Android Smartphone", 18);
        phone.displayProductDetails();
        System.out.println();

        Clothing jeans = new Clothing("CL02", "Jeans", 899.99, "Classic blue denim jeans", "Large", "Denim");
        jeans.displayProductDetails();
        System.out.println();

        Groceries bread = new Groceries("GR02", "Whole Wheat Bread", 165.0, "Fresh baked whole wheat bread", "2025-08-25");
        bread.displayProductDetails();
        System.out.println();

    }
}
