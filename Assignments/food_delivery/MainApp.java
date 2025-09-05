package com.food_delivery;

import com.food_delivery.config.AppConfig;
import com.food_delivery.order.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService normalOrderService = (OrderService) context.getBean("normalOrderService");
        normalOrderService.placeOrder("Keyboard",1500.0);

        System.out.println("-");

        OrderService primeOrderService = (OrderService) context.getBean("primeOrderService");
        primeOrderService.placeOrder("Laptop",50000.0);
        

    }
}
