package com.ford.assignment10;

import java.util.*;
import java.util.function.*;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0); // in USD

        // 1. Predicate – Free shipping if > ₹2000
        Predicate<Double> qualifiesFreeShipping = amount -> amount > 2000.0;

        // 2. Consumer – Print order confirmation
        Consumer<Double> confirmOrder = amount ->
                System.out.println("Order placed successfully for ₹" + amount);

        // 3. Supplier – coupon code
        Supplier<String> generateCoupon = () -> "SAVE" + (new Random().nextInt(900) + 100);

        // 4.  Convert USD to INR (1 USD = ₹83)
        Function<Double, Double> convertToINR = usd -> usd * 83;

        // 5. BiFunction – Apply discount
        BiFunction<Double, Double, Double> applyDiscount =
                (price, discount) -> price - (price * discount / 100);

        System.out.println("=== Online Orders ===");
        for (Double usd : ordersUSD) {
            double inr = convertToINR.apply(usd);
            confirmOrder.accept(inr);

            if (qualifiesFreeShipping.test(inr)) {
                System.out.println("Eligible for free shipping!");
            }

            String coupon = generateCoupon.get();
            System.out.println("Coupon Code: " + coupon);

            double finalPrice = applyDiscount.apply(inr, 10.0); // 10% discount
            System.out.println("Final price after discount: ₹" + finalPrice);

            System.out.println("---------------------------");
        }
    }
}
