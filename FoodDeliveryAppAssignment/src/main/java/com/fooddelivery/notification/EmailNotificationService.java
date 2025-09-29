package com.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("EmailNotification")
public class EmailNotificationService implements NotificatonService {


    @Override
    public void sendNotification(String message) {
        System.out.println("email notification"+message);
    }
}
