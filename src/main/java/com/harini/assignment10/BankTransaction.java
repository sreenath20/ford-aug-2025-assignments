package com.harini.assignment10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class BankTransaction {
    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);
        Predicate<Double> suspicious = (amount)->amount>50000.0;
        Consumer<Double> printAmount = (amount)-> System.out.println("Processed transaction of: "+amount);
        Supplier<Integer> otp = ()-> 2341;
        Function<Double,Double> processingFee = (amount)->amount+(amount*0.02);
        BiFunction<Double,Double,Double> discountPrice = (amount,feePercentage)-> amount = amount - (amount * feePercentage / 100);
        boolean loyaltyPoints = true;
        //System.out.println(suspicious.test(1200.0));
        //printAmount.accept(1200.0);
        for(Double amount:transactions){
            if(suspicious.test(amount)){
                System.out.println("This transaction seems suspicious");
                System.out.print("Want to continue (Y/N): ");
                Scanner sc = new Scanner(System.in);
                Character ch = sc.next().charAt(0);
                if(ch=='N'|| ch=='n'){
                    break;
                }
            }
            System.out.println("The OTP for the transaction is: "+otp.get());
            amount=processingFee.apply(amount);
            if(loyaltyPoints){
                amount = discountPrice.apply(amount,1.0);
            }
            printAmount.accept(amount);
        }

    }
}
