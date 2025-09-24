package Assignment2.orderModule;
import Assignment2.NotificationModule.EmailNotificationService;
import Assignment2.NotificationModule.NotificationService;
import Assignment2.PaymentModule.CardPaymentProcessor;
import Assignment2.PaymentModule.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("normalOrderService")

public class NormalOrderService implements OrderService {

    private PaymentProcessor paymentProcessor; //Inject Interface
    private NotificationService notificationService;

    @Autowired
    public NormalOrderService(@Qualifier("cardPayement") PaymentProcessor paymentProcessor, @Qualifier("EmailNotification") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    public NormalOrderService() {}

    public void placecOrder(String  name,Double amount) {

        System.out.println("Standard order processing for the items "+name+" and amount is "+amount);
        this.paymentProcessor.processPayment(amount);
        this.notificationService.sendNotification(name);

    }
}
