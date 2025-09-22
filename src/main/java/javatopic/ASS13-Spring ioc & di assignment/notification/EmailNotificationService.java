package org.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotificationService implements NotificationService {
    private String message;

    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent :"+message);

    }

    public EmailNotificationService() {
        this.message="Email recieved";
    }

    public EmailNotificationService(String message) {
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
        return "EmailNotificationService{" +
                "message='" + message + '\'' +
                '}';
    }
}
