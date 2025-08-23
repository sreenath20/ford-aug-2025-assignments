package Assignment3.ECommerceProductCatlog;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("E001", "Laptop", 1200.00, "High performance laptop", 24);
        Cloth shirt = new Cloth("C001", "Shirt", 25.50, "Cotton casual shirt", "M", "Cotton");
        Groceries milk = new Groceries("G001", "Milk", 2.99, "Fresh whole milk", LocalDate.of(2025, 8, 8));

        System.out.println("-----Electronics-----");
        laptop.displayProductDetails();

        System.out.println("-----Clothing-----");
        shirt.displayProductDetails();

        System.out.println("-----Groceries-----");
        milk.displayProductDetails();
    }
}
