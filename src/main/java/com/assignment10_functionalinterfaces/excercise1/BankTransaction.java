package com.assignment10_functionalinterfaces.excercise1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class BankTransaction {
    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);
        Predicate<Double> suspicious = (amount) -> amount > 50000.0;
        Consumer<Double> printAmount = (amount) -> System.out.println("Processed transaction of ₹" + amount);
        Supplier<Integer> otp = () -> new Random().nextInt(9000) + 1000;
        Function<Double, Double> processingFee = (amount) -> amount - (amount * 0.02);
        BiFunction<Double, Double, Double> discountPrice = (amount, feePercentage) -> amount - (amount * feePercentage / 100);
        boolean loyaltyPoints = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bank Transaction Processing System\n");

        for (Double amount : transactions) {
            System.out.println("Processing transaction: ₹" + amount);

            if (suspicious.test(amount)) {
                System.out.println("Alert: Transaction amount ₹" + amount + " is suspicious (> ₹50,000)");
                System.out.print("Do you want to continue? (Y/N): ");
                char ch = sc.next().charAt(0);
                if (ch == 'N' || ch == 'n') {
                    System.out.println("Transaction cancelled.\n");
                    continue;
                }
            }

            int otpValue = otp.get();
            System.out.println("Transaction OTP: " + otpValue);

            Double processingFeeAmount = amount * 0.02;
            Double amountAfterFee = processingFee.apply(amount);
            System.out.println("Processing fee (2%): ₹" + processingFeeAmount);
            System.out.println("Amount after processing fee: ₹" + amountAfterFee);

            Double finalAmount = amountAfterFee;
            if (loyaltyPoints) {
                finalAmount = discountPrice.apply(amount, 1.0);
                Double discountedFee = amount * 0.01;
                Double feeSavings = processingFeeAmount - discountedFee;
                System.out.println("Loyalty discount applied: 50% off processing fee");
                System.out.println("Discounted processing fee (1%): ₹" + discountedFee);
                System.out.println("Fee savings: ₹" + feeSavings);
                System.out.println("Final amount after discounted fee: ₹" + finalAmount);
            }

            printAmount.accept(finalAmount);
            System.out.println();
        }

        sc.close();
    }
}
