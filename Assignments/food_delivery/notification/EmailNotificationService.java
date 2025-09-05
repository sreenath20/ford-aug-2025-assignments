package com.food_delivery.notification;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emailNotification")
@Scope("prototype")
public class EmailNotificationService implements NotificationService {




    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification : " + message);
    }
}
