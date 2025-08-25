package assignment_05.online_shopping_system;

public class RegularCustomer extends  Customer {
    public RegularCustomer(String customerName) {
        super(customerName, "Regular Customer");
    }
    @Override
    public double calculateDiscount(double purchaseAmount) {
        System.out.println("Using Regular Customer discount calculation for " + customerName);
        return purchaseAmount * 0.03;
    }
}
