package assignment4.assignment4InheritanceEcommerceProductCatalog;

public class Groceries extends Product {

    private String expiryDate;

    public Groceries(Integer productId, String productName, Double productPrice, String productDescription, String expiryDate) {
        super(productId, productName, productPrice, productDescription);
        this.expiryDate = expiryDate;
    }

    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiry Date : " + expiryDate);
    }

}
