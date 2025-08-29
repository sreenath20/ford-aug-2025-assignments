abstract public class MenuItem {
    protected String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }
    public abstract void prepare();
}
