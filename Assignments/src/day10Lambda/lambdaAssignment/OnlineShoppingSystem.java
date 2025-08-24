package day10Lambda.lambdaAssignment;

import java.util.*;
import java.util.function.*;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);

        Predicate<Double> freeShipping = amount -> amount > 2000;

        Consumer<Double> orderConfirmation = amount ->
                System.out.println("Order placed successfully for ₹" + amount);

        Supplier<String> couponSupplier = () ->
                "SAVE" + ThreadLocalRandom.current().nextInt(100, 999);

        Function<Double, Double> usdToInr = usd -> usd * 83;

        BiFunction<Double, Double, Double> applyDiscount =
                (price, discount) -> price - (price * discount / 100);
        System.out.println("Online Shopping System");
        for (double orderUSD : ordersUSD) {

            double orderINR = usdToInr.apply(orderUSD);
            System.out.println("\nOrder in INR: ₹" + orderINR);
            if (freeShipping.test(orderINR)) {
                System.out.println("Eligible for FREE shipping");
            } else {
                System.out.println("Shipping charges will apply");
            }
            orderConfirmation.accept(orderINR);
            String coupon = couponSupplier.get();
            System.out.println("Coupon code: " + coupon);
            double finalPrice = applyDiscount.apply(orderINR, 10.0);
            System.out.println("Final Price after 10% discount: ₹" + finalPrice);
        }
    }
}

