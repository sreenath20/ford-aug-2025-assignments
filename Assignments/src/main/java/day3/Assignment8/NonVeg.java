package day3.Assignment8;

public class NonVeg extends MenuItem{
    int calories;
    String spiceLevel;

    public NonVeg(String name, double price, String type, int calories, String spiceLevel) {
        super(name, price, "NonVeg");
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Calories: " + calories);
        System.out.println("Spice Level: " + spiceLevel);
    }
}
