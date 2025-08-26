package day10.FunctionalInterface;

import java.util.Random;
import java.util.function.*;

public class Assignment1 {
    public static void main(String[] args) {
        //1. Predicate<Double> – Check if a transaction is suspicious (greater than ₹50,000).
        Predicate<Double> checkTransaction=(transaction)-> transaction > 50000.00;
        System.out.println("Transaction is Suspicious: "+checkTransaction.test(55000.00));

        //2. Consumer<Double> – Print a message for each transaction: "Processed transaction of ₹<amount>"
        Consumer<Double> amount=(data)->System.out.println("Processed Transaction of amount: "+data);
        amount.accept(1200.00);

        //3. Supplier<Integer> – Generate a random 4-digit OTP for transaction verification.
        Supplier<Integer> otpSupplier=()->{
            Random random=new Random();
            return 1000+random.nextInt(1000);
        };
        Integer otp=otpSupplier.get();
        System.out.println("Your transaction OTP is: "+otp);

       // 4. Function<Double, Double> – Deduct a 2% processing fee from each transaction.
        Function<Integer,Integer> deductFee=(amountOne)->(int)Math.round(amountOne*0.98);
        Integer OriginalAmount=3000;
        Integer FinalAmount=deductFee.apply(OriginalAmount);
        System.out.println("Amount after deduction of processing fee is "+FinalAmount);

        //5. BiFunction<Double, Double, Double> – Apply a discount on processing fee if customer has loyalty points:
        //finalAmount = amount - (amount * feePercentage / 100).
        BiFunction<Double,Double,Double> discount=(amountTwo,feePercentage)->amountTwo-(amountTwo*feePercentage/100);
        Double OriginalAmountTwo=5000.00;
        Double FeePercent=0.2;
        Double FinalAmountTwo=discount.apply(OriginalAmountTwo,FeePercent);
        System.out.println("Amount after discount is "+FinalAmountTwo);

    }
}
