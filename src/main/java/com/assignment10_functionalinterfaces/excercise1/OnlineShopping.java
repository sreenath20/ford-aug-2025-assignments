package com.assignment10_functionalinterfaces.excercise1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class OnlineShopping {
    public static void main(String[] args) {
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);
        Predicate<Double> isFreeShipping = (amount) -> amount > 2000.0;
        Consumer<Double> orderPlaced = (amount) -> System.out.println("Order placed successfully for ₹" + amount);
        Supplier<String> couponCode = () -> "SAVE" + (new Random().nextInt(900) + 100);
        Function<Double, Double> usdToInr = (amount) -> amount * 83.0;
        BiFunction<Double, Double, Double> discountPrice = (amount, discount) -> amount - (amount * discount / 100);

        System.out.println("Online Shopping System\n");

        for (Double amountUSD : ordersUSD) {
            System.out.println("Processing order: $" + amountUSD);

            Double amountINR = usdToInr.apply(amountUSD);
            System.out.println("Converted to INR: ₹" + amountINR);

            if (isFreeShipping.test(amountINR)) {
                System.out.println("Congratulations! Your order qualifies for free shipping (above ₹2000)");
            } else {
                System.out.println("Order does not qualify for free shipping");
            }

            String coupon = couponCode.get();
            System.out.println("Coupon code: " + coupon);

            Double finalAmount = discountPrice.apply(amountINR, 10.0);
            System.out.println("Amount after 10% discount: ₹" + finalAmount);

            orderPlaced.accept(finalAmount);
            System.out.println();
        }
    }
}
