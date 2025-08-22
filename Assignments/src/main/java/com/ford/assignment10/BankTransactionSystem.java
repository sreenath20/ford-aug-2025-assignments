package com.ford.assignment10;

import java.util.*;
import java.util.function.*;

public class BankTransactionSystem {
    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);

        // 1. Predicate – Suspicious if > ₹50,000
        Predicate<Double> isSuspicious = amount -> amount > 50000.0;

        // 2. Consumer – Print transaction message
        Consumer<Double> printTransaction = amount ->
                System.out.println("Processed transaction of ₹" + amount);

        // 3. Supplier – Generate 4-digit OTP
        Supplier<Integer> generateOTP = () -> new Random().nextInt(9000) + 1000;

        // 4. Function – Deduct 2% processing fee
        Function<Double, Double> deductFee = amount -> amount - (amount * 0.02);

        // 5. BiFunction – Apply discount on fee if loyalty points
        BiFunction<Double, Double, Double> applyDiscount =
                (amount, feePercent) -> amount - (amount * feePercent / 100);

        System.out.println("=== Bank Transactions ===");
        for (Double amount : transactions) {
            if (isSuspicious.test(amount)) {
                System.out.println("Suspicious transaction detected: ₹" + amount);
            }

            printTransaction.accept(amount);

            int otp = generateOTP.get();
            System.out.println("Transaction OTP: " + otp);

            double afterFee = deductFee.apply(amount);
            System.out.println("After 2% fee: ₹" + afterFee);

            double finalAmount = applyDiscount.apply(amount, 1.0); // 1% discount
            System.out.println("Final amount after loyalty discount: ₹" + finalAmount);

            System.out.println("---------------------------");
        }
    }
}

