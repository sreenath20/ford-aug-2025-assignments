package com.assignment.day12_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Day12Assignment1 {
    public static void main(String[] args) {

        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);

        //Predicate
        Predicate<Double> checkTransaction = transaction -> transaction > 50000.0;
        System.out.println(checkTransaction.test(55000.0));

        //Consumer
        Consumer<Double> processTransaction = transaction -> System.out.println("Processed transaction of amount " + transaction);
        processTransaction.accept(23000.0);

        //Supplier
        Supplier<Integer> otpGenerator = () -> 4821;
        System.out.println("OTP GENERATED : "+otpGenerator.get());

        //Function
        Function<Double,Double> processingFeeFunction = (transaction) -> 0.2*transaction;
        System.out.println("PROCESSING FEE : "+processingFeeFunction.apply(23000.0));

        //BiFunction
        BiFunction<Double,Double,Double> discountOnProcessingFeeFunction = (amount, feePercentage) -> (amount - ( (amount * feePercentage) / 100));
        System.out.println("TOTAL AMOUNT AFTER DISCOUNT : "+discountOnProcessingFeeFunction.apply(23000.0,5.0));

    }
}
