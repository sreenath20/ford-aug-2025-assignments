package com.fooddelivery.order;

import com.fooddelivery.notification.NotificatonService;
import com.fooddelivery.notification.SmsNotificationService;
import com.fooddelivery.payment.UPIPaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("PrimeOrder")
public class PrimeOrderService implements OrderService {

    private UPIPaymentProcessor upiPaymentProcessor;
    private SmsNotificationService smsNotificationService;

    public PrimeOrderService() {}
    @Autowired
    public  PrimeOrderService(@Qualifier("UPIPayment") UPIPaymentProcessor upiPaymentProcessor,@Qualifier("smsNotifications") SmsNotificationService smsNotificationService) {
        this.upiPaymentProcessor = upiPaymentProcessor;
        this.smsNotificationService = smsNotificationService;
    }
    @Override
    public void placeOrder(String item,double amount) {
        System.out.println("Placing Prime Order "+item);
        this.upiPaymentProcessor.processPayment(amount);
        this.smsNotificationService.sendNotification("Prime Order has been placed successfully");

    }
}
