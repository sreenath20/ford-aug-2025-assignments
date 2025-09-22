package javatopic.day5abstraction.assignment.assignment1;

public class PayPalGateway  extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("amount process refund"+amount);
    }
    @Override
    public void processRefund(double amount) {
        System.out.println("amount process refund"+amount);
    }

}
