package assignment_03.online_food_delivery_system;

class Order {
    private int orderNumber;
    private String customerName;
    private MenuItem[] orderItems;
    private int itemCount;

    public Order(String customerName, int orderNumber) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderItems = new MenuItem[15];
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public MenuItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(MenuItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void addItem(MenuItem item) {
        if (itemCount < 15) {
            orderItems[itemCount] = item;
            itemCount++;
            System.out.println("Added to Orders: " + item.getName()+ " ("+ item.getCategory() + ")" + " - Rs. " + item.getPrice());
        } else {
            System.out.println("Cannot add more items. Order is full!");
        }
    }

    public double calculateTotalBill() {
        double totalBill = 0.0;

        for (int i = 0; i < itemCount; i++) {
            totalBill += orderItems[i].getPrice();
        }
        return totalBill;
    }

    public void displayOrder() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Items: " + itemCount);
        System.out.println("Items Ordered:");

        if (itemCount == 0) {
            System.out.println("No items in order yet.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + orderItems[i].getName() +" - Rs." + orderItems[i].getPrice());
            }
        }
        System.out.println("Total Bill: Rs." + calculateTotalBill());
    }
}
