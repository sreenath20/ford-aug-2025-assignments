package day10Lambda.lambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

public class BankTransactionSystem {
    public static void main(String[] args) {
        List<Double> transactions= Arrays.asList(1200.0,55000.0,30000.0);
        //1
        Predicate<Double>  transactionPredicate=transaction->transaction>50000.0;
        //2
        Consumer<Double> transactionConsumer=(e)-> System.out.println("Processede transaction of Rs."+e);
        //3
        Supplier<Integer> randomNumberGenerator = () -> ThreadLocalRandom.current().nextInt(1000,9999);
        //4
        Function<Double,Double> deductFunction=(amount)->amount-(amount*0.02);
        //5
        BiFunction<Double,Double,Double> discountFunction=(amount,feePercent)->amount-(amount*feePercent/100);

        for(Double transaction:transactions){
            System.out.println("----------------------------");
            if(transactionPredicate.test(transaction)){
                System.out.println("Suspicious transaction: "+transaction);
                continue;
            }

            transactionConsumer.accept(transaction);

            Integer otp=randomNumberGenerator.get();
            System.out.println("Transaction OTP: "+otp);

            double afterFee=deductFunction.apply(transaction);
            System.out.println("After 2% fee: "+afterFee);

            double finalAmount=discountFunction.apply(afterFee,10.0);
            System.out.println("Final amount: "+finalAmount);
        }

    }
}
