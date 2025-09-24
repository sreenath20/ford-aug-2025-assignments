package com.fooddelivery.service;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.order.OrderService;
import com.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessingService {

    private NotificationService notificationService;
    private PaymentProcessor paymentProcessor;
    private OrderService orderService;


    public OrderProcessingService(@Qualifier("normal") OrderService orderService, @Qualifier("card")PaymentProcessor paymentProcessor, @Qualifier("email")NotificationService notificationService) {
        this.orderService = orderService;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
        System.out.println("OrderProcessingService bean is created");
    }

    public void placeOrder(String item,double amount){
        orderService.placeOrder(item,amount);
    }

    public void processPayment(double amount){
        paymentProcessor.processPayment(amount);
    }

    public void sendNotification(String message){
        notificationService.sendNotification(message);
    }
}
