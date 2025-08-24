package assignment4.assignment4InheritanceEcommerceProductCatalog;

public class Driver {
    public static void main(String[] args) {
        Product product = new Product(1245,"Laptop",57000.76,"Dell Laptop");
        product.displayProductDetails();

        Electronics electronics = new Electronics(3567,"Headphones", 3500.54,"JBL Headphones",4);
        electronics.displayProductDetails();

        Clothing clothing = new Clothing(5578,"Pants",999.54,"Max Straight Pants", 28,"Cotton");
        clothing.displayProductDetails();

        Groceries groceries = new Groceries(1177,"Milk",56.89,"Amul Toned Milk", "2025/08/15");
        groceries.displayProductDetails();
    }
}
