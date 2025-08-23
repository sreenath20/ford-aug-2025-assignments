public class PaymentDemo {
    public static void main(String[] args) {
        Payment paymentRef;

        // Payment reference holds a CreditCardPayment object
        paymentRef = new CreditCardPayment();
        paymentRef.processPayment(500.0);

        // Payment reference holds a UPIPayment object
        paymentRef = new UPIPayment();
        paymentRef.processPayment(300.0);

        // Payment reference holds a CashPayment object
        paymentRef = new CashPayment();
        paymentRef.processPayment(200.0);

    }
}

class Payment {
    // Method intended to be overridden
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs. " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount);
    }
}

class CashPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of Rs. " + amount);
    }
}
