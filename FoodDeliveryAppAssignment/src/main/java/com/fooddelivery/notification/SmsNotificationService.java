package com.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("smsNotifications")
public class SmsNotificationService implements NotificatonService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification Service"+message);

    }
}
