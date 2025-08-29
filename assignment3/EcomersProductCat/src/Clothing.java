public class Clothing extends Product{
    private String size;
    private String fabric;
    private String clothingType;

    public Clothing(String size, String fabric, String clothingType) {
        this.size = size;
        this.fabric = fabric;
        this.clothingType = clothingType;
    }

    public Clothing() {
    }

    public Clothing(int productID, String productName, double price, String description, String size, String fabric, String clothingType) {
        super(productID, productName, price, description);
        this.size = size;
        this.fabric = fabric;
        this.clothingType = clothingType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getClothingType() {
        return clothingType;
    }

    public void setClothingType(String clothingType) {
        this.clothingType = clothingType;
    }

    public void displayProductInfo()
    {
        System.out.println("Details of Clothing:");
        System.out.println("----------------------");
        System.out.println("Product name: "+super.getProductName());
        System.out.println("Product price: "+super.getPrice());
        System.out.println("productid: "+super.getProductID());
        System.out.println("Description: "+super.getDescription());
        System.out.println("Size: "+this.getSize());
        System.out.println("Fabric: "+this.getFabric());
        System.out.println("Clothing type: "+this.getClothingType());


    }
}
