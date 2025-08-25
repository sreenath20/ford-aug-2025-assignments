package assignment_05.online_shopping_system;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("=== Online Shopping System ===\n");
        RegularCustomer regular = new RegularCustomer("Joy");
        PremiumCustomer premium = new PremiumCustomer("Sam");
        double purchaseAmount = 100.0;
        int loyaltyPoints = 50;
        System.out.println("--- STATIC POLYMORPHISM (Method Overloading) ---");
        System.out.println("Same object, different method signatures\n");

        regular.displayCustomerInfo();
        double discount1 = regular.calculateDiscount(purchaseAmount);
        double discount2 = regular.calculateDiscount(purchaseAmount, loyaltyPoints);
        System.out.println("Discount (amount only): Rs." + discount1);
        System.out.println("Discount (amount + loyalty): Rs." + discount2);
        System.out.println();

        premium.displayCustomerInfo();
        double discount3 = premium.calculateDiscount(purchaseAmount);
        double discount4 = premium.calculateDiscount(purchaseAmount, loyaltyPoints);
        System.out.println("Discount (amount only): Rs." + discount3);
        System.out.println("Discount (amount + loyalty): Rs." + discount4);
        System.out.println();

        System.out.println("--- DYNAMIC POLYMORPHISM (Method Overriding) ---");
        System.out.println("Same method signature, different implementations\n");

        Customer customer1 = new RegularCustomer("Malavika");
        Customer customer2 = new PremiumCustomer("Rini");

        customer1.displayCustomerInfo();
        double regularDiscount = customer1.calculateDiscount(purchaseAmount);
        System.out.println("Discount: Rs." + regularDiscount);
        System.out.println();

        customer2.displayCustomerInfo();
        double premiumDiscount = customer2.calculateDiscount(purchaseAmount);
        System.out.println("Discount: Rs." + premiumDiscount);
        System.out.println();

        System.out.println("--- COMBINING BOTH POLYMORPHISMS ---");
        System.out.println("Array of customers with different method calls\n");

        Customer[] customers = {
                new RegularCustomer("David"),
                new PremiumCustomer("Madhu"),
                new RegularCustomer("Francis")
        };

        for (int i = 0; i < customers.length; i++) {
            customers[i].displayCustomerInfo();

            double discount_method1 = customers[i].calculateDiscount(purchaseAmount);

            double discount_method2 = customers[i].calculateDiscount(purchaseAmount, loyaltyPoints);

            System.out.println("Method 1 (amount only): Rs." + discount_method1);
            System.out.println("Method 2 (amount + loyalty): Rs." + discount_method2);
            System.out.println("Total savings: Rs." + (discount_method1 + discount_method2));
            System.out.println();
        }

    }
}
