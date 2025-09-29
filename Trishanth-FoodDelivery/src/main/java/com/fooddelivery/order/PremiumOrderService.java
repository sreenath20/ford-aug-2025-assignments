package com.fooddelivery.order;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("PremiumOrder")
@Scope("prototype")
public class PremiumOrderService implements OrderService {
    private PaymentService paymentService;
    private NotificationService notificationService;

    @Autowired
    public void PrimeOrderService(@Qualifier("UPIPayment")PaymentService paymentService, @Qualifier("SMSNotification") NotificationService notificationService){
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }



    @Override
    public void placeOrder(String item, Double amount) {
        System.out.println("Fast track order for premium users");
        this.paymentService.processPayment(amount);
        this.notificationService.sendNotification("Premium order placed for "+item);
    }

}
