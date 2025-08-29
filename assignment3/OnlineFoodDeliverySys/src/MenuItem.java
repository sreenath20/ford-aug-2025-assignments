public class MenuItem {
    private String name;
    private double price;
    private String type;
    private int calories;
    private String spiceLevel;

    public MenuItem() {

    }

    public MenuItem(String name, double price, String type, int calories, String spiceLevel) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.calories = calories;
        this.spiceLevel = spiceLevel;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }
    public void displayItem() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Type: " + getType());
        System.out.println("Calories: " + getCalories());
        System.out.println("Spice Level: " + getSpiceLevel());
        System.out.println("-----------------------------");
    }
}

     class VegItem extends MenuItem {
        public VegItem() {
        }

        public VegItem(String name, double price, String type, int calories, String spiceLevel) {
            super(name, price, type, calories, spiceLevel);
        }
    }

     class NonVegItem extends MenuItem {
        public NonVegItem() {
        }

        public NonVegItem(String name, double price, String type, int calories, String spiceLevel) {
            super(name, price, type, calories, spiceLevel);
        }




    }





