package assignment10.assignment10Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BankTransactionSystem {
    public static void main(String[] args) {
        List<Double> transactionsList = Arrays.asList(1200.0, 55000.0, 30000.0);
        Random transactionOTP = new Random();

        Predicate<Double> transactionPredicate = (amount) -> (amount > 50000);
        Consumer<Double> transactionConsumer = (amount) -> System.out.println("Processed transaction of ₹" + amount);
        Supplier<Integer> oneTimePasswordSupplier = () -> transactionOTP.nextInt(1000);
        BiFunction<Double,Double,Double> finalAmountFunction = (originalAmount, feePercent)-> (originalAmount -(originalAmount * feePercent/100));


        for (Double transaction : transactionsList) {
            Double feesPercent = 100.0;
            if (transactionPredicate.test(transaction)) {
                System.out.println("Susceptible transactions, Amount greater than 50000");
                System.out.println(transaction);
            } else {
                transactionConsumer.accept(transaction);
                System.out.println("The OTP for your transaction is : " + oneTimePasswordSupplier.get());
                System.out.println(" The final amount after applying processing fee : "+ finalAmountFunction.apply(transaction,feesPercent));

                ;
            }
        }
    }
}
