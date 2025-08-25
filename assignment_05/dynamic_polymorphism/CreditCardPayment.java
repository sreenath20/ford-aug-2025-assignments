package assignment_05.dynamic_polymorphism;

public class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs." + amount);
        System.out.println("- Validating credit card details...");
        System.out.println("- Checking credit limit...");
        System.out.println("- Payment successful via Credit Card!");
    }
}
