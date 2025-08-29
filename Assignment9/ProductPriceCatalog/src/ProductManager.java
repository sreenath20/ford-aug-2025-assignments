import java.util.*;

public class ProductManager {


    //creating catalog with a data type map
    private Map<Integer, Product> catalog;

    public ProductManager() {
        catalog = new HashMap<>();
    }


    //CRUD - operations

    // Adding new product
    public void addProduct(Product product) {
        catalog.put(product.getProductID(), product);
        System.out.println("Added product " + product.getProductID());
    }

    //removing an element by productID

    public void removeProduct(int productID) {
        if (catalog.containsKey(productID)) {

            catalog.remove(productID);
            System.out.printf("Removed product with product ID %d\n", productID);
        } else {
            System.out.printf("No product with product ID %d\n", productID);
        }


    }

    //updating the price of the product by productID
    public void updateProductPrice(int id, double newPrice) {
        if (catalog.containsKey(id)) {
            Product product = catalog.get(id);
            product.setPrice(newPrice);
            System.out.printf("Updated price of the product with product ID %d\n", id);
        } else {
            System.out.printf("No product with product ID %d\n", id);
        }
    }


    //view all products in catalog
    public void getAllProducts() {
        System.out.println("All products: ");
        for (Product product : catalog.values()) {
            System.out.println(product.toString());
        }
    }

    //Searching
    public void searchProductById(int productID) {
        if (catalog.containsKey(productID)) {
            Product product = catalog.get(productID);
            System.out.println("Found product with product ID " + productID);
            System.out.println(product.toString());
        } else {
            System.out.printf("No product with product ID %d\n", productID);
        }
    }

    //  Find all products lower than a given price.
    public void productsCheaperThan(double price) {
        boolean available = false;
        for (Product product : catalog.values()) {
            if (product.getPrice() < price) {
                System.out.println(product);
                available = true;
            }
        }
        if (available == false) {
            System.out.println("No available product with price " + price);
        }

    }

    //Sorting
    // sort by name
    public void sortByName() {
        List<Product> productList = new ArrayList<>(catalog.values());
        productList.sort(new nameComparator());

        System.out.println("Sorted by name");
        for (Product product : productList) {
            System.out.println(product.toString());
        }

    }

    // by price (ascending order)
    public void sortByPriceAscending() {
        List<Product> productList = new ArrayList<>(catalog.values());
        productList.sort(new PriceComparator());
        System.out.println("Sorted in Ascending Order by price");
        for (Product product : productList) {
            System.out.println(product.toString());
        }

    }

    // by price descending order
    public void sortByPriceDescending() {
        List<Product> productList = new ArrayList<>(catalog.values());
        productList.sort(new PriceComparator().reversed());
        System.out.println("Sorted in Descending Order by price");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }


}
