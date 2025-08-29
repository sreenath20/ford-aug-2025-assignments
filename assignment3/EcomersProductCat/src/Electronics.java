public class Electronics extends Product{
    private int warrentyPeriod;
    private String brand;

    public Electronics() {

    }
    public Electronics(int warrentyPeriod, String brand) {
        this.warrentyPeriod = warrentyPeriod;
        this.brand = brand;
    }

    public Electronics(int productID, String productName, double price, String description, int warrentyPeriod, String brand) {
        super(productID, productName, price, description);
        this.warrentyPeriod = warrentyPeriod;
        this.brand = brand;
    }

    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

    public void setWarrentyPeriod(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayProductInfo(){
        System.out.println("Details of Electronics:");
        System.out.println("----------------------");
        System.out.println("Brand: " + this.brand);
        System.out.println("Product Name :"+ super.getProductName());
        System.out.println("Product Id :"+ super.getProductID());
        System.out.println("Price :"+ super.getPrice());
        System.out.println("Description :"+ super.getDescription());
        System.out.println("Warrenty Period: " + this.warrentyPeriod);

    }
}
