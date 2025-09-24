package com.fooddelivery.order;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("prime")
@Component
public class PrimeOrderService implements OrderService {

    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    public PrimeOrderService(@Qualifier("upi")PaymentProcessor paymentProcessor, @Qualifier("sms")NotificationService notificationService) {
        System.out.println("PrimeOrderService bean is created");
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Prime Order is placed for "+item+" and it's price is "+amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification(item);
    }
}
