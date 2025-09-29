package com.fooddelivery;

import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.NormalOrderService;
import com.fooddelivery.order.PrimeOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);

        NormalOrderService normalOrderService = (NormalOrderService) iocContainer.getBean("NormalOrder");
        normalOrderService.placeOrder("Dell Laptop",90000.0);
        System.out.println("---------------------------------------------");
        PrimeOrderService primeOrderService = (PrimeOrderService) iocContainer.getBean("PrimeOrder");
        primeOrderService.placeOrder("Mac Book",150000.0);
    }

}
