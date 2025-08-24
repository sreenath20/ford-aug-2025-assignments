package day5.assignment5_polymorphisam.staticAndDynamic;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Base customer discount "+customer.calculateDiscount(1000));
        System.out.println("Base customer discount (amount+loyality points):"+customer.calculateDiscount(1000,10));


        RegularCustomer regularCustomer = new RegularCustomer();
        System.out.println("Regular Customer discount " + regularCustomer.calculateDiscount(1000.0));

        PremiumCustomer premiumCustomer = new PremiumCustomer();
        System.out.println("Premium Customer discount " + premiumCustomer.calculateDiscount(1000.0));
    }
}
