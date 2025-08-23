package Assignment5.CombiningStaticAndDynamicPolymorphism;

public class Driver {
        public static void main(String[] args) {
            Customer base = new Customer();
            Customer regular = new RegularCustomer();
            Customer premium = new PremiumCustomer();

            // Static Polymorphism (method overloading)
            System.out.println("Base Customer Discount: " + base.calculateDiscount(1000.0));
            System.out.println("Base Customer Discount with Loyalty: " + base.calculateDiscount(1000.0, 120));

            // Dynamic Polymorphism (method overriding)
            System.out.println("Regular Customer Discount : " + regular.calculateDiscount(1000.0));
            System.out.println("Premium Customer Discount : " + premium.calculateDiscount(1000.0));
        }

}
