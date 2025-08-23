package Assignment5.DynamicPolymorphism;

public class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

