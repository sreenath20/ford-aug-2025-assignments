//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();


        // adding products into catalog

        productManager.addProduct(new Product(1, "mouse", 29));
        productManager.addProduct(new Product(2, "Keyboard", 49));
        productManager.addProduct(new Product(3, "Monitor", 199));
        productManager.addProduct(new Product(4, "Laptop", 599));

        productManager.getAllProducts();
        System.out.println();

        //removing products by id

        productManager.removeProduct(3);
        productManager.getAllProducts();
        System.out.println();

        //updating the price of a product by id
        productManager.updateProductPrice(4,999);

        //viewing all products

        productManager.getAllProducts();
        System.out.println();

        // Searching
//         by id
        productManager.searchProductById(4);
        productManager.getAllProducts();
        System.out.println();

//        finding products lower than given price
        System.out.println("cheaper then the price 199");
        productManager.productsCheaperThan(199);

//        sorting
//         by name
        productManager.sortByName();

        System.out.println();

//        sort by price(Ascending order)

        productManager.sortByPriceAscending();

        System.out.println();

//        sort by Descending order
        productManager.sortByPriceDescending();

        System.out.println();


    }
}