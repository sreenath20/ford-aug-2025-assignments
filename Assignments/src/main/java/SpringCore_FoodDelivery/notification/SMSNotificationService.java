package SpringCore_FoodDelivery.notification;


import org.springframework.stereotype.Component;

@Component ("smsNotificationService")
public class SMSNotificationService implements NotificationService {


    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification Service: " + message);
    }
}
