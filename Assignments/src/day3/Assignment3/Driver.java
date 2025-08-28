package day3.Assignment3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(11, "Laptop", 60659.05,
                "ryzen 5, 32GB RAM, 512GB SSD", 12);

        Clothing tshirt = new Clothing(22, "Pant", 900.00,
                "Straight Fit", "32", "Jeans");

        Groceries rice = new Groceries(303, "wheat", 600.00,
                "Premium", LocalDate.now().plusMonths(12));

        //product
        List<Product> catalog = new ArrayList<>();
        catalog.add(laptop);
        catalog.add(tshirt);
        catalog.add(rice);

        //all product
        System.out.println("----------Product Catalog----------");
        for (Product p : catalog) {
            p.displayProductDetails();
            System.out.println("-----------------------");
        }
    }
}
