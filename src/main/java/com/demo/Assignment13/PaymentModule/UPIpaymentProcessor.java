package Assignment2.PaymentModule;
import org.springframework.stereotype.Component;

@Component("UPIpayment")
public class UPIpaymentProcessor implements PaymentProcessor {

    public void processPayment(Double amount) {

        System.out.println("Processing UPI Payments");
    }
}
