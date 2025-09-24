package com.fooddelivery.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("email")
@Component
public class EmailNotificationService implements NotificationService{


    public EmailNotificationService() {
        System.out.println("EmailNotificationService bean is created");
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Email: "+"The order for the item "+message+"is placed successfully");
    }
}
