package com.food_delivery.notification;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("smsNotification")
@Scope("prototype")
public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification Service : "+ message);
    }
}
