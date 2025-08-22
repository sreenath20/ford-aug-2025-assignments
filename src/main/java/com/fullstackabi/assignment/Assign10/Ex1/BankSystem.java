package com.fullstackabi.assignment.Assign10.Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class BankSystem {
    public static void main(String[] args) {


        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);
        //Check if a transaction is suspicious (greater than ₹50,000)
        Predicate<Double> isSuspicious = transaction -> transaction > 50000;
        List<Double> isSuspiciousTrans =
                transactions.stream().filter(isSuspicious).toList();
        System.out.println("Suspicious Transaction amount is " + isSuspiciousTrans);

        //Processed transaction of ₹<amount>"
        Consumer<Double> printMsg = transaction -> System.out.println("Processed transaction: " + transaction);
        transactions.forEach(printMsg);

        // Generate a random 4-digit OTP for transaction verification.
        Supplier<Integer> otp = () -> {
            Random rand = new Random();
            return rand.nextInt(10000) + 999;
        };
        System.out.println("4-DIGIT OTP :" +otp.get());
//        for(int i=0;i<3;i++){
//            System.out.println(otp.get());
//        }

        //Deduct a 2% processing fee from each transaction.
        Double deductPercentage = 0.02;
        Function<Double,Double> deduction = (transaction) -> transaction - deductPercentage ;
        List <Double> afterDeduction =
                transactions.stream().map(deduction).sorted().toList();
        System.out.println("Transactions after processing fees deduction " +afterDeduction);

        //BiFunction<Double, Double, Double> – Apply a discount on processing fee if
        //customer has loyalty points:
        //finalAmount = amount - (amount * feePercentage / 100).

        BiFunction<Double,Double,Double> finalAmount = (amount,feePercentage) -> amount - (amount * feePercentage /100);
        Predicate<Double> isLoyaltyPoints = transaction -> transaction > 50000;
        List<Double> discountFees = transactions.stream()
                .filter(isLoyaltyPoints)
                .toList();

        for(Double discountFee : discountFees) {
            System.out.println("Discounted fee is " +finalAmount.apply(discountFee,10.00));
        }


    }
}
