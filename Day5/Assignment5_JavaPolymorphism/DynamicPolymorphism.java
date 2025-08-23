public class DynamicPolymorphism {

    static class Payment {
        public void processPayment(double amount) {
            System.out.println("Processing generic payment of $" + amount);
        }
    }

    static class CreditCardPayment extends Payment {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount + " (charging card...)");
        }
    }

    static class UPIPayment extends Payment {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing UPI payment of $" + amount + " (using UPI gateway...)");
        }
    }

    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.processPayment(120.50);
        p2.processPayment(50.00);
    }
}
