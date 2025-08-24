package assignment4.assignment4InheritanceEcommerceProductCatalog;

public class Electronics extends Product {

       private Integer warrantyPeriod;

    public Electronics(Integer productId, String productName, Double productPrice, String productDescription, Integer warrantyPeriod) {
        super(productId, productName, productPrice, productDescription);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Warranty Period : "+warrantyPeriod);
    }



}
