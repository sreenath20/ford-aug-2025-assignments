package Assignment2.PaymentModule;
import org.springframework.stereotype.Component;

@Component("cardPayement")
public class CardPaymentProcessor implements PaymentProcessor {
        public void processPayment(Double amount) {

        System.out.println("Processing Card Payment");
    }
}
