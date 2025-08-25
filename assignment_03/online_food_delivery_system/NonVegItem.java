package assignment_03.online_food_delivery_system;

public class NonVegItem extends MenuItem {
    private int calories;
    private String spiceLevel;

    public NonVegItem(String name, double price, int calories, String spiceLevel) {
        super(name, price, "Non-Vegetarian");
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    public int getCalories() {

        return calories;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayItem() {
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs." + getPrice());
        System.out.println("Type: " + getCategory());
        System.out.println("Calories: " + calories);
        System.out.println("Spice Level: " + spiceLevel);
        System.out.println("");
    }
}
