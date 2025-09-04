package assignment_10.part1_functional_interfaces_and_lambda;

import java.util.*;
import java.util.function.*;

public class BankTransactionSystem {
    public static void main(String[] args) {
        System.out.println("\nBank Transaction System\n");

        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);

        //Check suspicious transaction
        Predicate<Double> isSuspicious = amount -> amount > 50000.0;

        //Print transaction message
        Consumer<Double> printTransaction = amount -> System.out.println("Processed transaction of Rs." + amount);

        //Generate random 4-digit OTP
        Supplier<Integer> generateOTP = () -> {
            Random random = new Random();
            return 1000 + random.nextInt(9000);
        };

        //Deduct 2% processing fee
        Function<Double, Double> deductFee = amount -> amount - (amount * 0.02);

        //Apply discount on fee with loyalty points
        BiFunction<Double, Double, Double> applyDiscount = (amount, feePercentage) ->
                amount - (amount * feePercentage / 100);

        for (Double transaction : transactions) {
            if (isSuspicious.test(transaction)) {
                System.out.println("Alert!!! Suspicious transaction of Rs." + transaction);
            }
            printTransaction.accept(transaction);

            Integer otp = generateOTP.get();
            System.out.println("Transaction OTP: " + otp);

            Double afterFee = deductFee.apply(transaction);
            System.out.println("Amount after 2% fee: Rs." + afterFee);

            Double finalAmount = applyDiscount.apply(transaction, 1.0);
            System.out.println("Final amount with loyalty discount: Rs." + finalAmount);
            System.out.println();
        }
    }
}
