package com.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("smsNotificationService")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification...");
        System.out.println("SMS: " + message);
    }
}
