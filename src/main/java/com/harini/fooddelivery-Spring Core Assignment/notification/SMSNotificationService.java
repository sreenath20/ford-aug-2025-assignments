package com.fooddelivery.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("sms")
@Component
public class SMSNotificationService implements NotificationService {

    public SMSNotificationService(){
        System.out.println("SMSNotificationService bean is created");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: "+"The order for the item "+message+"is placed successfully");
    }
}
