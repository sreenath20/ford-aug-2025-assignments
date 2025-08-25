package assignment_04.restaurant_order_management;

public abstract class MenuItem {
    protected String itemName;

    public MenuItem(String itemName) {
        this.itemName=itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //public abstract void prepare();
}


