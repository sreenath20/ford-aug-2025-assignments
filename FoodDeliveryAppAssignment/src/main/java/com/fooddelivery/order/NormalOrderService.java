package com.fooddelivery.order;


import com.fooddelivery.notification.EmailNotificationService;
import com.fooddelivery.payment.NormalPaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("NormalOrder")
public class NormalOrderService implements OrderService {

    private EmailNotificationService emailNotificationService;
    private NormalPaymentProcessor normalPaymentProcessor;

    public NormalOrderService()
    {

    }
    @Autowired
    public NormalOrderService(@Qualifier("EmailNotification") EmailNotificationService emailNotificationService, @Qualifier("NormalPayment") NormalPaymentProcessor normalPaymentProcessor) {
        this.emailNotificationService = emailNotificationService;
        this.normalPaymentProcessor = normalPaymentProcessor;
    }
    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Placing Normal Order"+item);
        this.normalPaymentProcessor.processPayment(amount);
        this.emailNotificationService.sendNotification("The Normal Order has been placed successfully");

    }
}
