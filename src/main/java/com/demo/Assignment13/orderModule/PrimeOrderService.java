package Assignment2.orderModule;
import Assignment2.NotificationModule.SMSnotificationService;
import Assignment2.PaymentModule.UPIpaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("primeOrderService")
public class PrimeOrderService  implements OrderService{
 private UPIpaymentProcessor upipaymentProcessor;
 private SMSnotificationService smsnotificationService;

     @Autowired
    public PrimeOrderService(@Qualifier("UPIpayment") UPIpaymentProcessor upipaymentProcessor, @Qualifier("SmsNotification") SMSnotificationService smsnotificationService) {
        this.upipaymentProcessor = upipaymentProcessor;
        this.smsnotificationService = smsnotificationService;
    }

    @Override
    public void placecOrder(String name, Double amount) {

        System.out.println("PrimeOrderService: placecOrder"+name+" "+amount);
        upipaymentProcessor.processPayment(amount);
        smsnotificationService.sendNotification(name);

     }
}
