package com.fooddelivery;

import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.NormalOrderService;
import com.fooddelivery.order.OrderService;
import com.fooddelivery.order.PrimeOrderService;
import com.fooddelivery.service.OrderProcessingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //OrderProcessingService orderProcessingService = context.getBean(OrderProcessingService.class);
        //order placing
//        OrderService normalOrder = context.getBean(NormalOrderService.class);
//        normalOrder.placeOrder("Bag",525.9);
//
//        OrderService primeOrder = context.getBean(PrimeOrderService.class);
//        primeOrder.placeOrder("Hand Bag",825.9);
        //orderProcessingService.placeOrder("Bag",525.90);

        //payment processing
//        PaymentProcessor cardPayment = context.getBean(CardPaymentProcessor.class);
//        cardPayment.processPayment(525.9);
//
//        PaymentProcessor upiPayment = context.getBean(UPIPaymentProcessor.class);
//        upiPayment.processPayment(825.9);
        //orderProcessingService.processPayment(525.90);

        //notification sending
//        NotificationService emailNotification = context.getBean(EmailNotificationService.class);
//        emailNotification.sendNotification("Order is placed successfully");
//
//        NotificationService smsNotifation = context.getBean(SMSNotificationService.class);
//        smsNotifation.sendNotification("Order is placed successfully");
        //orderProcessingService.sendNotification("Order placed successfully");

        OrderService normalOrder = context.getBean(NormalOrderService.class);
        normalOrder.placeOrder("Bag",525.90);

        OrderService primeOrder = context.getBean(PrimeOrderService.class);
        primeOrder.placeOrder("Hand Bag",865.87);
    }
}
