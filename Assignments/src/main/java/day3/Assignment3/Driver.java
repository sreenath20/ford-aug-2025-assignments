package day3.Assignment3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Driver {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(101, "Laptop", 75999.00,
                "Ryzen 7, 16GB RAM, 512GB SSD", 24);

        Clothing tshirt = new Clothing(202, "Graphic T-Shirt", 799.00,
                "Regular fit round neck", "S", "100% Cotton");

        Groceries rice = new Groceries(303, "Organic Basmati Rice (5kg)", 799.00,
                "Premium aged long grain", LocalDate.now().plusMonths(12));

        //product catalog (list)
        List<Product> catalog = new ArrayList<>();
        catalog.add(laptop);
        catalog.add(tshirt);
        catalog.add(rice);

        // Display all product details
        System.out.println("----------Product Catalog----------");
        for (Product p : catalog) {
            p.displayProductDetails();
            System.out.println("-----------------------");
        }
    }
}
