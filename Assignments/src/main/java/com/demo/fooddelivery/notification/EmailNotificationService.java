package com.demo.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {

        System.out.println("Sending email :" + message);
    }
}
