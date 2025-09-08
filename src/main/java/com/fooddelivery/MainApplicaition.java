package com.fooddelivery;

import com.fooddelivery.config.AppConfig;
import com.fooddelivery.order.NormalOrderService;
import com.fooddelivery.order.PrimeOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicaition {
    public static void main(String[] args) {

        //inversion of control - which is going to allocate memory of all components inside the container
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);

        NormalOrderService normalOrderService = (NormalOrderService) iocContainer.getBean("normalOrder");
        normalOrderService.placeOrder("Laptop",75000.0);

        PrimeOrderService primeOrderService = (PrimeOrderService) iocContainer.getBean("primeOrder");
        primeOrderService.placeOrder("IPAD",125000.0);

    }
}
