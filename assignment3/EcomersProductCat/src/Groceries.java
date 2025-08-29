public class Groceries extends Product{
    private int expiryInMonths;
    private String groceryType;

    public Groceries() {

    }
    public Groceries(int expiryInMonths, String groceryType) {
        this.expiryInMonths = expiryInMonths;
        this.groceryType = groceryType;
    }

    public Groceries(int productID, String productName, double price, String description, int expiryInMonths, String groceryType) {
        super(productID, productName, price, description);
        this.expiryInMonths = expiryInMonths;
        this.groceryType = groceryType;
    }

    public int getExpiryInMonths() {

        return expiryInMonths;
    }

    public void setExpiryInMonths(int expiryInMonths) {
        this.expiryInMonths = expiryInMonths;
    }

    public String getGroceryType() {
        return groceryType;
    }

    public void setGroceryType(String groceryType) {
        this.groceryType = groceryType;
    }

    public void displayProductInfo(){
        System.out.println("Details of Groceries: ");
        System.out.println("----------------------");
        System.out.println("Product name: "+super.getProductName());
        System.out.println("Product price: "+super.getPrice());
        System.out.println("productid: "+super.getProductID());
        System.out.println("description: "+super.getDescription());
        System.out.println("expiryInMonths: "+expiryInMonths);
        System.out.println("groceryType: "+groceryType);

    }
}
