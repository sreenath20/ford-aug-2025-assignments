package assignment_05.online_shopping_system;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String customerName) {
        super(customerName, "Premium Customer");
    }
    @Override
    public double calculateDiscount(double purchaseAmount) {
        System.out.println("Using Premium Customer discount calculation for " + customerName);
        return purchaseAmount * 0.15;
    }
}
