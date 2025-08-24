package day4.Assignment6;

public abstract class MenuItem {
    String itemName;
    public MenuItem(String itemName) {
        this.itemName = itemName;
    }
    public abstract void prepare();
}
