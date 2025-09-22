package org.fooddelivery;

import org.fooddelivery.config.AppConfig;

import org.fooddelivery.order.NormalOrderService;

import org.fooddelivery.order.PrimeOrderService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {
    public static void main(String[] args) {


        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);



          NormalOrderService normalOrderService= (NormalOrderService) context.getBean("normalOrder");
          normalOrderService.placeOrder(" \"Onion dosa\" ",150);

          PrimeOrderService primeOrderService= (PrimeOrderService) context.getBean("primeOrder");
          primeOrderService.placeOrder(" \"Special Onion dosa :) \" ",250);
    }
}