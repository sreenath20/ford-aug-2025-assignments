package com.fooddelivery.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.fooddelivery.payment.PaymentProcessor;
import com.fooddelivery.notification.NotificationService;

@Component("primeOrderService")
public class PrimeOrderService implements OrderService {
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    @Autowired
    public PrimeOrderService(
            @Qualifier("upiPaymentProcessor") PaymentProcessor paymentProcessor,
            @Qualifier("smsNotificationService") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Processing PRIME order for: " + item + " - Amount: Rs." + amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification("Your PRIME order for " + item + " is being prepared with high priority!\n");
        //System.out.println("Prime order completed!\n");
    }
}
