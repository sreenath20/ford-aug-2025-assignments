package SpringCore_FoodDelivery.order;

import org.fooddelivery.notification.NotificationService;
import org.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("primeOrder")
public class PrimeOrderService implements OrderService {

    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    public PrimeOrderService() {
    }

    @Autowired
    public PrimeOrderService(@Qualifier("upiPayment") PaymentProcessor paymentProcessor,@Qualifier("smsNotification") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, Double amount) {
        System.out.println("Placing prime order for item "+item+" and amount "+amount);
        this.paymentProcessor.processPayment(amount);
        this.notificationService.sendNotification("Your prime  order for item "+item+" has been placed successfully !!");
    }
}
