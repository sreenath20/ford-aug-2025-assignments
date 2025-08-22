package com.fullstackab.OOPS.Day11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class LamdbaDriver {
    public static void main(String[] args) {

        //Predicate<T> – Filter High Scores
        List<Integer> scores = Arrays.asList(45, 78, 90, 32, 60, 85);
        Predicate<Integer> isHighScore = score -> score > 50;
        List<Integer> highScore =
                scores
                        .stream()
                        .filter(isHighScore)
                        .collect(Collectors.toList());
        System.out.println(highScore);

        //. Consumer<T> – Send Alerts for Large Transactions
        List<Double> transactions = Arrays.asList(5000.0, 15000.0, 25000.0, 8000.0);
        Predicate<Double> isLargeTrans = transaction -> transaction > 10000;
        Consumer<Double> alert = transaction -> System.out.println("Alert : High Transaction Detected > 10000");
        transactions.stream().filter(isLargeTrans).forEach(alert);

        //Supplier<T> – Generate Random PIN
        Supplier<Integer> atmPin = () -> {
            System.out.println("ATM Pin");
            Random rand = new Random();
            return rand.nextInt(9999);
        };
        for (int i = 0; i < 3; i++) {
            System.out.println(atmPin.get());
        }

        //Function<T, R> – Convert Currency
        List<Double> usdAmounts = Arrays.asList(10.0, 25.5, 100.0);
        double usdExchangeRate = 83.0;
        Function<Double, Double> toCurrency = usdAmount -> usdAmount * usdExchangeRate;
        List<Double> inrCurrency =
                usdAmounts
                        .stream()
                        .map(toCurrency)
                        .collect(Collectors.toList());
        System.out.println(inrCurrency);

        //BiFunction<T, U, R> – Calculate Discounted Price

        BiFunction<Double, Double, Double> finalPrice =
                (originalPrice, discountPercentage) -> originalPrice - (originalPrice * discountPercentage / 100);
        System.out.println("Discounted Price : " + finalPrice.apply(4000.00, 5.0));

        //Predicate<Integer/Double/String> → Check conditions (pass/fail, threshold,
        //matching).
        //• Consumer<String/Double> → Print or log alerts, messages, reports.
        //• Supplier<Integer/String> → Generate random data (PIN, OTP, IDs).
        //• Function<Double, Double> → Transform data (currency conversion, unit conversion).
        //• BiFunction<Double, Double, Double> → Combine inputs (price + discount, marks +
        //bonus)

    }
}
