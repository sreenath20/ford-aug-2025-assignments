package SpringCore_FoodDelivery.payment;

import org.springframework.stereotype.Component;

@Component ("cardpaymentprocessor")
public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment for amount: "+amount);

    }
}
