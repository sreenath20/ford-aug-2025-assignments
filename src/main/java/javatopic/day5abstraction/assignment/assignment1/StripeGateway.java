package javatopic.day5abstraction.assignment.assignment1;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {


    @Override
    public void processPayment(double amount) {
      System.out.println("amount process"+amount);
    }//class StripeGateway' must either be declared abstract or implement abstract method 'processPayment(double)' in 'PaymentProcessor

    public void processRefund(double amount) {
       System.out.println("amount process refund"+amount);
    }

}
