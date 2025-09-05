package com.food_delivery.order;

import com.food_delivery.notification.EmailNotificationService;
import com.food_delivery.notification.NotificationService;
import com.food_delivery.payment.CardPaymentProcessor;
import com.food_delivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrimeOrderService implements OrderService {

    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;

    @Autowired
    public PrimeOrderService(@Qualifier("upiPayment")PaymentProcessor paymentProcessor, @Qualifier("smsNotification") NotificationService notificationService){
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }



    @Override
    public void placeOrder(String item, Double amount) {
        System.out.println("Fast track order for premium users");
        this.paymentProcessor.processPayment(amount);
        this.notificationService.sendNotification("Premium order placed for "+item);
    }
}
