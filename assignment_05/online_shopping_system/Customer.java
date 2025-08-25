package assignment_05.online_shopping_system;

public class Customer {
    protected String customerName;
    protected String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }
    public double calculateDiscount(double purchaseAmount) {
        System.out.println("Using base discount calculation for " + customerName);
        return purchaseAmount * 0.05;
    }
    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        System.out.println("Using loyalty points discount calculation for " + customerName);
        double baseDiscount = purchaseAmount * 0.05;
        double loyaltyDiscount = loyaltyPoints * 0.10;
        return baseDiscount + loyaltyDiscount;
    }
    public void displayCustomerInfo() {
        System.out.println("Customer: " + customerName + " (" + customerType + ")");
    }
}
