package com.fooddelivery.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.fooddelivery.payment.PaymentProcessor;
import com.fooddelivery.notification.NotificationService;

@Component("normalOrderService")
public class NormalOrderService implements OrderService {
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    @Autowired
    public NormalOrderService(
            @Qualifier("cardPaymentProcessor") PaymentProcessor paymentProcessor,
            @Qualifier("emailNotificationService") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Processing NORMAL order for: " + item + " - Amount: Rs." + amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification("Your normal order for " + item + " has been placed successfully!\n");
        //System.out.println("Normal order completed!\n");
    }
}