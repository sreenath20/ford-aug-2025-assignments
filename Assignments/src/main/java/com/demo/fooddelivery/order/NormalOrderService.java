package com.demo.fooddelivery.order;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("normalOrder")
public class NormalOrderService implements OrderService{

    private PaymentService paymentService;
    private NotificationService notificationService;
// default constructor
    //
//    public NormalOrderService() {
//    }

    @Autowired
    public NormalOrderService(@Qualifier("emailNotification") NotificationService notificationService,
                              @Qualifier("cardPayment") PaymentService paymentService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }

    @Override
    public void placeOrder(String item, Double amount) {
        // logic goes here
        System.out.println("Placing Normal order for Item :"+item);
        this.paymentService.processPayment(amount);
        this.notificationService.sendNotification("Your normal order for Item "+item+" has been placed");
    }
}
