package com.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS NOTIFICATION : "+message);
    }
}
