package org.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SMSNotificationService implements NotificationService {
   private String message;
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent:"+message);
    }

    public SMSNotificationService() {
        this.message="SMS recieved";
    }

    public SMSNotificationService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SMSNotificationService{" +
                "message='" + message + '\'' +
                '}';
    }
}
