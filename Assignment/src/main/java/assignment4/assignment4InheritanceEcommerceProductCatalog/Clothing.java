package assignment4.assignment4InheritanceEcommerceProductCatalog;

public class Clothing extends Product{
     private Integer size;
     private String fabric;

    public Clothing(Integer productId, String productName, Double productPrice, String productDescription, Integer size, String fabric) {
        super(productId, productName, productPrice, productDescription);
        this.size = size;
        this.fabric = fabric;
    }

    public void displayProductDetails() {

        super.displayProductDetails();
        System.out.println("Product size   : " + size);
        System.out.println("Product Fabric : " + fabric);
    }

}
