package com.harini.assignment10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class OnlineShopping {
    public static void main(String[] args) {
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);
        Predicate<Double> isFreeShipping = (amount)->amount>2000.0;
        Consumer<Double> orderPlaced = (amount)-> System.out.println("Order placed successfully for Rs."+amount);
        Supplier<String> otp = ()-> "SAVE123";
        Function<Double,Double> usdToInr = (amount)->amount*87.09;
        BiFunction<Double,Double,Double> discountPrice = (amount, discount)-> amount = amount - (amount * discount / 100);
        for(Double amount:ordersUSD){
            amount=usdToInr.apply(amount);
            if(isFreeShipping.test(amount)){
                System.out.println("Congratulations! Your order is eligible for free delivery");
            }
            System.out.println(otp.get());
            amount = discountPrice.apply(amount,10.0);
            orderPlaced.accept(amount);
        }

    }
}
