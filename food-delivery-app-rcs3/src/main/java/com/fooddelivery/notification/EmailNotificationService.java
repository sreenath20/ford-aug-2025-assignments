package com.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("emailNotificationService")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification...");
        System.out.println("Email: " + message);
    }
}
