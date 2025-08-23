package Assignment4.RestaurantOrderManagement;

public abstract class MenuItem {
    protected String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }

    public abstract void prepare();
}
