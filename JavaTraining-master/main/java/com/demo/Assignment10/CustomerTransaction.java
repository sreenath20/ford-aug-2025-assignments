package com.demo.Assignment10;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CustomerTransaction {
    public static void main(String[] args) {

        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);
        Predicate<Double> checkSuspicious = (Double transactionAmount) -> {
            if (transactionAmount == 55000.0) {return true;}return false;};
        Consumer<Double> processTransaction = (Double transactionAmount) -> {
            System.out.println("Processing Transaction of amount " + transactionAmount);
        };
        Supplier<Integer> OTP=()->(int)(Math.random() * 9000) + 1000;
        Function<Double,Double> transactionFee=(Double amount)->amount*0.2;
        BiFunction<Double,Double,Double>  transactionFeeBiFunction=(Double Loyalty,Double Amount)->{
            if(Loyalty>0){
                return Amount-(0.2*Amount/100);
            }
            return Amount;
        };
        for(Double transaction : transactions) {
            System.out.println("the otp is: "+OTP.get());
            System.out.println(checkSuspicious.test(transaction));
            processTransaction.accept(transaction);
            System.out.println("2% processing fee so the amount is: "+transactionFee.apply(transaction));
            Double fees=5.0;
            System.out.println("discount on processing fee"+transactionFeeBiFunction.apply(fees,transaction));
    }

    }
}
