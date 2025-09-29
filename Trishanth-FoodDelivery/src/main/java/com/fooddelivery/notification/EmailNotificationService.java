package com.fooddelivery.notification;

import com.fooddelivery.order.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("EmailNotification")
@Scope("prototype")
public class EmailNotificationService implements NotificationService {


    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email Notification: " + message);

    }
}
