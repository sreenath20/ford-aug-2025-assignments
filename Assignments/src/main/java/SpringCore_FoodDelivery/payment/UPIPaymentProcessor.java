package SpringCore_FoodDelivery.payment;


import org.springframework.stereotype.Component;

@Component ("upipaymentprocessor")
public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment for amount " + amount);
    }
}
