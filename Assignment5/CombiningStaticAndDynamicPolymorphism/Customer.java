package Assignment5.CombiningStaticAndDynamicPolymorphism;

public class Customer {
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.05; // 5% default discount
    }

    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        if (loyaltyPoints > 100) {
            return purchaseAmount * 0.1; // 10% discount for loyal customers
        } else {
            return purchaseAmount * 0.03; // 3% discount otherwise
        }
    }
}
