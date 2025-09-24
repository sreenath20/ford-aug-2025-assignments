package Assignment2;

import Assignment2.NotificationModule.EmailNotificationService;
import Assignment2.NotificationModule.SMSnotificationService;
import Assignment2.PaymentModule.CardPaymentProcessor;
import Assignment2.PaymentModule.UPIpaymentProcessor;
import Assignment2.orderModule.NormalOrderService;
import Assignment2.orderModule.OrderService;
import Assignment2.orderModule.PrimeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //contains bean and to deine an bean 
@ComponentScan(basePackages = "Assignment2") //to search for a bean class in assignment2
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);//IOC container allocates memory for the objects
        NormalOrderService normalOrderService = (NormalOrderService) context.getBean("normalOrderService");
        normalOrderService.placecOrder("Laptop",500.0);
        PrimeOrderService  primeOrderService = (PrimeOrderService) context.getBean("primeOrderService");
        primeOrderService.placecOrder("book",502.3);
    }
}
