package assignment4.assignment4InheritanceEcommerceProductCatalog;

public class Product {
    private Integer productId;
    private String productName;
    private Double productPrice;
    private String productDescription;

    public Product() {
    }

    public Product(Integer productId, String productName, Double productPrice, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void displayProductDetails(){
        System.out.println("The product details are:");
        System.out.println("Product ID          : " +productId);
        System.out.println("Product Name        : " +productName);
        System.out.println("Product Price       : " +productPrice);
        System.out.println("Product Description : " +productDescription);

    }
}
