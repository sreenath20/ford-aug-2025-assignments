package Assignment3.OnlineFoodDeliverySystem;

public class VegItem extends MenuItem {
    private int calories;
    private String spiceLevel;

    public VegItem(String name, double price, String type, int calories, String spiceLevel) {
        super(name, price, type);
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("Calories: " + calories);
        System.out.println("Spice Level: " + spiceLevel);
    }
}
