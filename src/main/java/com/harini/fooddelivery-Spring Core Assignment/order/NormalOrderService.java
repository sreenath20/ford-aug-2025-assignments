package com.fooddelivery.order;


import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("normal")
@Component
public class NormalOrderService implements OrderService {

    @Autowired
    @Qualifier("card")
    private PaymentProcessor paymentProcessor;

    @Autowired
    @Qualifier("email")
    private NotificationService notificationService;

    public NormalOrderService(){
        System.out.println("NormalOrderService bean is created");
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Normal Order is placed for "+item+" and it's price is "+amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification(item);
    }
}
