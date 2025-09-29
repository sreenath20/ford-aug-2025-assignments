package com.fooddelivery;

import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Food Delivery Application \n");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---  Scenario: Normal Order  --- ");
        OrderService normalOrderService = context.getBean("NormalOrder", OrderService.class);
        normalOrderService.placeOrder("puri", 50.0);

        System.out.println("---  Scenario: Prime Order  --- ");
        OrderService primeOrderService = context.getBean("PremiumOrder", OrderService.class);
        primeOrderService.placeOrder("idli", 45.0);

        context.close();  }
}
