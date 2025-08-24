package day5.Assignment3;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.calculateDiscount(1000);
        customer.calculateDiscount(450.00, (byte) 12);
        Customer customer2 = new RegularCustomer();
        customer2.calculateDiscount(1000);
        Customer customer3 = new PremiumCustomer();
        customer3.calculateDiscount(1000);
    }
}
