package Assignment2.NotificationModule;

import org.springframework.stereotype.Component;

@Component("EmailNotification")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("You successfully made order for "+message);


    }
}
