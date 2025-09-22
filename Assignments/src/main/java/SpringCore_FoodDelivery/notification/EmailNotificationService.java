package SpringCore_FoodDelivery.notification;

import org.springframework.stereotype.Component;

@Component ("emailNotificationService")
public class EmailNotificationService implements NotificationService {


    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification Service:  " + message);
    }
}
