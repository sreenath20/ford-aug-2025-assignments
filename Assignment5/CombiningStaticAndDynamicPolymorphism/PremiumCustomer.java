package Assignment5.CombiningStaticAndDynamicPolymorphism;

public class PremiumCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.15; // 15% for premium customers
    }
}
