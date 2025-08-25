package assignment_05.dynamic_polymorphism;

public class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs." + amount);
        System.out.println("- Connecting to UPI gateway...");
        System.out.println("- Verifying UPI PIN...");
        System.out.println("- Payment successful via UPI!");
    }
}
