package com.fooddelivery;

import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.NormalOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);

        NormalOrderService normalOrderService = (NormalOrderService) iocContainer.getBean("normalOrder");
        normalOrderService.placeOrder("Laptop",55000.0);
    }

}
