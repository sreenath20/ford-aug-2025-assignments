import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);

//        functions
//        1.predicate<T> - used for logical test contitions
//        takes one input and returns boolean
//        mostly used for true or false (Conditional-based filtering)

        Predicate<Double> isSuspecious = amount -> amount > 50000;
        System.out.println("----------------------");


//          2.Consumer<T> - for printing purpose we use this
//          consumer takes input but returns void
        Consumer<Double> printTransaction = amount -> System.out.println("Transaction is processed of amount :₹" + amount);
        System.out.println("----------------------");


//      3.Supplier<T> - supply/to generate a value without input
        Supplier<Integer> otpSupplier = () -> 1000 + new Random().nextInt(9000);
        System.out.println("---------------------");


//        4.Function<T, R>: for transformation
//        Takes input T and returns R
        Function<Double, Double> deductFee = amount -> amount - (amount * 0.02);
        System.out.println("----------------------");


        //    5.BiFunction<T, U, R> - Takes T and R inputs(2 inputs) and returns R
        BiFunction<Double, Double, Double> applyDiscount = (amount, feePercentage) -> amount - (amount * feePercentage / 100);

        //looping through all the transactions
        for (Double transaction : transactions) {
//      Predicate
            if (isSuspecious.test(transaction)) {
                System.out.println("Suspicious transaction detected: ₹" + transaction);
            }

//            consumer
            printTransaction.accept(transaction);

//            supplier-OTP generation
            int otp = otpSupplier.get();
            System.out.println("Transaction otp :" + otp);

//            Function : deduct fee
            double afterFee = deductFee.apply(transaction);
            System.out.println("Amount after 2% processing fee: ₹" + afterFee);

//            BiFunctin: discount is 1% on processing fee
            double loyalityDiscount = applyDiscount.apply(transaction, 1.0);
            System.out.println("amount after 1% loyality discount : ₹" + loyalityDiscount);
            System.out.println("---------------------");
        }


    }
}
