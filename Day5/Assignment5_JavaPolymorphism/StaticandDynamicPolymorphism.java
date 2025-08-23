public class StaticandDynamicPolymorphism {

    static class Customer {
        public double calculateDiscount(double purchaseAmount) {
            System.out.println("Customer.calculateDiscount(double)");
            return purchaseAmount * 0.02;
        }

        public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
            System.out.println("Customer.calculateDiscount(double, int)");
            double base = calculateDiscount(purchaseAmount);
            double bonus = loyaltyPoints * 0.001;
            return base + (purchaseAmount * bonus);
        }
    }
    static class RegularCustomer extends Customer {
        @Override
        public double calculateDiscount(double purchaseAmount) {
            System.out.println("RegularCustomer.calculateDiscount(double)");
            return purchaseAmount * 0.03;
        }
    }
    static class PremiumCustomer extends Customer {
        @Override
        public double calculateDiscount(double purchaseAmount) {
            System.out.println("PremiumCustomer.calculateDiscount(double)");
            return purchaseAmount * 0.07;
        }
    }

    public static void main(String[] args) {
        Customer base = new Customer();
        Customer reg = new RegularCustomer();
        Customer prem = new PremiumCustomer();

        double amount = 200.0;

        System.out.println("Base discount (single-arg): " + base.calculateDiscount(amount));
        System.out.println("Base discount (two-arg): " + base.calculateDiscount(amount, 10));

        System.out.println("Regular discount: " + reg.calculateDiscount(amount));
        System.out.println("Premium discount: " + prem.calculateDiscount(amount));

        System.out.println("Premium discount with points: " + prem.calculateDiscount(amount, 20));

    }
}
