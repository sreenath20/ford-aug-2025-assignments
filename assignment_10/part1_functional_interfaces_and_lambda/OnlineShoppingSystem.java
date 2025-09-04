package assignment_10.part1_functional_interfaces_and_lambda;

import java.util.*;
import java.util.function.*;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Online Shopping System\n");
        List<Double> ordersUSD = Arrays.asList(50.0, 15.0, 300.0);

        //Convert USD to INR (1 USD = 83 INR)
        Function<Double, Double> convertToINR = usd -> usd * 83;

        // Check free shipping (above ₹2000)
        Predicate<Double> freeShipping = amount -> amount > 2000.0;

        //Print order confirmation
        Consumer<Double> printOrder = amount -> System.out.println("Order placed successfully for Rs." + amount);

        //Generate random coupon code
        Supplier<String> generateCoupon = () -> {
            Random random = new Random();
            int num = random.nextInt(900) + 100;
            return "SAVE" + num;
        };

        //Apply percentage discount
        BiFunction<Double, Double, Double> applyDiscount = (price, discount) ->
                price - (price * discount / 100);

        for (Double orderUSD : ordersUSD) {
            Double orderINR = convertToINR.apply(orderUSD);
            System.out.println(orderUSD + " USD → Rs." + orderINR);
            if (freeShipping.test(orderINR)) {
                System.out.println("Free shipping available!");
            }
            printOrder.accept(orderINR);

            String coupon = generateCoupon.get();
            System.out.println("Coupon code: " + coupon);

            Double finalPrice = applyDiscount.apply(orderINR, 10.0);
            System.out.println("Final price after 10% discount: Rs." + finalPrice);
            System.out.println();
        }
    }
}
