package day10.FunctionalInterface;

import java.util.Random;
import java.util.function.*;

public class Assignment2 {
    public static void main(String[] args) {

        //1. Predicate<Double> – Check if order qualifies for free shipping (above ₹2000).
        Predicate<Integer> qualityCheck=(orderAmount)->orderAmount > 2000;
        System.out.println("Order Qualifies for free shipping :"+qualityCheck.test(8000));

        //2. Consumer<Double> – Print the order confirmation: "Order placed successfully for ₹<amount>".
        Consumer<Double> consumerAmount=(amount)-> System.out.println("Order Placed Successfully for amount :"+amount);
        consumerAmount.accept(1500.0);

        //3. Supplier<String> – Generate a random coupon code (like "SAVE123").
        Supplier<String> couponSupplier=() -> {
            Random random=new Random();
            return "SAVE"+random.nextInt(300);
        };
        String coupon=couponSupplier.get();
        System.out.println("Your Coupon Code is:" +coupon);

        //4. Function<Double, Double> – Convert price from USD to INR (1 USD = 83 INR).
        Function<Double,Double> conversion=(usDollar)->usDollar*87.74;
        System.out.println("The Conversion of Dollar to Rupees is: "+conversion.apply(500.0));

        //5. BiFunction<Double, Double, Double> – Apply percentage discount on an order: finalPrice = price - (price * discount/100).
        BiFunction<Double,Double,Double> finalPrice=(price,discount)->price-(price*discount/100);
        System.out.println("The price after Discount is :"+finalPrice.apply(1850.0,15.0));
    }
}
