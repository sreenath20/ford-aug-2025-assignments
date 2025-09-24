package Assignment2.NotificationModule;


import org.springframework.stereotype.Component;

@Component("SmsNotification")
public class SMSnotificationService implements NotificationService {


    @Override
    public void sendNotification(String message) {

        System.out.println("Sending SMS Notification: "+message);

    }
}
