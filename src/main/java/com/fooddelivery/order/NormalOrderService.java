package com.fooddelivery.order;


import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("normalOrder")
public class NormalOrderService implements OrderService {

    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    public NormalOrderService() {
    }

    @Autowired
    public NormalOrderService(@Qualifier("cardPayment") PaymentProcessor paymentProcessor, @Qualifier("emailNotification") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, Double amount) {
        System.out.println("Normal Order Placed for item "+item+" and amount "+amount);
        this.paymentProcessor.processPayment(amount);
        this.notificationService.sendNotification("Your normal order for item "+item+" and amount "+amount+" has been placed successfully");
    }
}
