package com.fooddelivery.notification;

import com.fooddelivery.order.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("SMSNotification")
@Scope("prototype")
public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);

    }
}
