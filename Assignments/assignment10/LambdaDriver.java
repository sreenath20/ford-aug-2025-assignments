package com.assignments.assignment10;

import java.util.Random;
import java.util.function.*;

public class LambdaDriver {

    static void BankTransactionSystem() {

        Predicate<Double> isSuspicious = (amount) -> amount >= 50000.0;
        System.out.println("Is suspicious transaction of Rs. 550000 ?" + isSuspicious.test(550000.0));

        Consumer<Double> displayTransaction = (amount) -> {
            System.out.println("Processed transaction of Rs. " + amount);
        };
        displayTransaction.accept(1200.0);

        Supplier<Integer> generateOTP = () -> new Random().nextInt(9000) + 1000;
        System.out.println("Generated OTP: Transaction OTP :" + generateOTP.get());

        Function<Double, Double> deductionOfProcessFee = (amount) -> amount * 0.02;
        System.out.println("Process fee(2%) of Rs. 40000.0 is Rs." + deductionOfProcessFee.apply(40000.0));

        BiFunction<Double, Double, Double> discountOnDeduction = (amount, loyalityPoints) -> amount * 0.02 - loyalityPoints;
        System.out.println("Process fee(2%) with 150 loyaltyPoints of Rs. 10000.0 is Rs."+discountOnDeduction.apply(100000.0,150.0));
    }
    static void OnlineShoppingSystem(){

        Predicate<Double> ifFreeShipping = (amount) -> amount >= 2000.0;
        System.out.println("Order qualifies for free shipping Rs.2500 ?"+ifFreeShipping.test(2500.0));

        Consumer<Double> ordering = (amount) -> System.out.println("Order placed successfully for Rs." + amount);
        ordering.accept(10000.0);

        Supplier<String> couponCode = ()-> "SAVE"+(new Random().nextInt(900)+100);
        System.out.println("Coupon Code :"+couponCode.get());

        Function<Double,Double> usdToInr = (usd)->usd*83;
        System.out.println("$50 to INR : Rs."+usdToInr.apply(50.0));

        BiFunction<Double,Double,Double> dicountCalculator = (amount,discount)->amount-amount*discount/100;
        System.out.println("After discount of shopping for Rs.12000.50 : Rs."+dicountCalculator.apply(12000.50,13.0));
    }


    public static void main(String[] args) {
        BankTransactionSystem();
        OnlineShoppingSystem();
    }

}

