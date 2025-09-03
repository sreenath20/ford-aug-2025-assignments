package com.assignment.day12;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Day12Assignment2 {
    public static void main(String[] args) {

        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);

        //Predicate
        Predicate<Double> freeShippingQualifier = orderUSD -> orderUSD>2000;
        System.out.println("Free Shipping Qualifier : "+freeShippingQualifier.test(5000.0));
        
        //Consumer
        Consumer<Double> orderComfirmation = amount -> System.out.println("Order placed successfully for : "+amount);
        orderComfirmation.accept(5000.0);

        //Supplier
        Supplier<String> couponcodeGenerator = () -> "SAVE123";
        System.out.println("COUPON CODE GENERATOR : "+couponcodeGenerator.get());

        //Function
        Function<Double,Double> convertUSDtoINR = usd -> usd*83;
        System.out.println("50 USD = "+convertUSDtoINR.apply(50.0)+" INR");

        //BiFunction
        BiFunction<Double,Double,Double> percentageDiscount = (price,discount) -> (price-((price*discount)/100));
        System.out.println("FINAL PRICE AFTER DISCOUNT : "+percentageDiscount.apply(5000.0,5.0));


    }
}
