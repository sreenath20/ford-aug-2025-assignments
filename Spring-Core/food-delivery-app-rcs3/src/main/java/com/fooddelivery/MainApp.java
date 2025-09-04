package com.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.OrderService;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Food Delivery Application \n");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---  Scenario: Normal Order  --- ");
        OrderService normalOrderService = context.getBean("normalOrderService", OrderService.class);
        normalOrderService.placeOrder("Mini-Tiffin", 355);

        System.out.println("---  Scenario: Prime Order  --- ");
        OrderService primeOrderService = context.getBean("primeOrderService", OrderService.class);
        primeOrderService.placeOrder("Podi Dosa", 42.50);

        ((AnnotationConfigApplicationContext) context).close();
    }
}