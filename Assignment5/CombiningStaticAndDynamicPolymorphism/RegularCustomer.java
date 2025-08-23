package Assignment5.CombiningStaticAndDynamicPolymorphism;

public class RegularCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.07; // 7% for regular customers
    }
}

