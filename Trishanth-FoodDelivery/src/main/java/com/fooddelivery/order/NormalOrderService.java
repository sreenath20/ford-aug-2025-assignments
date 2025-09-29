package com.fooddelivery.order;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("NormalOrder")
public class NormalOrderService implements OrderService {

    private PaymentService paymentService;
    private NotificationService notificationService;

    @Autowired
    public NormalOrderService(@Qualifier("CardPaymentProcessor")PaymentService paymentService, @Qualifier("EmailNotification") NotificationService notificationService){
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }


    @Override
    public void placeOrder(String item, Double amount) {
        System.out.println("Standard order processing.");
        this.paymentService.processPayment(amount);
        this.notificationService.sendNotification("Normal order placed for "+item);
    }
}
