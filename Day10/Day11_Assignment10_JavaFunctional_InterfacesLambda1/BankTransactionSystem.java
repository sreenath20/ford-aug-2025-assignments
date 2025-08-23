package Day11_Assignment10_JavaFunctional_InterfacesLambda1;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class BankTransactionSystem {

    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(1200.0, 55000.0, 30000.0);

        // 1. Predicate<Double> – suspicious if > ₹50,000
        Predicate<Double> isSuspicious = amount -> amount > 50000.0;

        // 2. Consumer<Double> – print processed message
        Consumer<Double> processPrinter = amount ->
                System.out.println("Processed transaction of ₹" + amount);

        // 3. Supplier<Integer> – random 4-digit OTP generator
        Random rng = new Random();
        Supplier<Integer> otpSupplier = () -> rng.nextInt(9000) + 1000; // 1000..9999

        // 4. Function<Double, Double> – deduct a 2% processing fee
        Function<Double, Double> deductProcessingFee = amount -> amount - (amount * 2.0 / 100.0);

        // 5. BiFunction<Double, Double, Double> – apply finalAmount using feePercentage
        // finalAmount = amount - (amount * feePercentage / 100)
        BiFunction<Double, Double, Double> applyFeePercentage = (amount, feePercent) ->
                amount - (amount * feePercent / 100.0);

        System.out.println("== Bank Transaction Processing ==");

        // 1. Detect suspicious transactions
        System.out.println("-- Suspicious transactions --");
        transactions.stream()
                .filter(isSuspicious)
                .forEach(amount -> System.out.println("Suspicious transaction detected: ₹" + amount));

        // 2. Print processed message for each transaction (Consumer)
        System.out.println("\n-- Process messages --");
        transactions.forEach(processPrinter);

        // 3. Generate OTP
        System.out.println("\n-- OTPs for suspicious transactions --");
        transactions.stream()
                .filter(isSuspicious)
                .forEach(amount -> System.out.println("Transaction amount ₹" + amount + " OTP: " + otpSupplier.get()));

        // 4. Deduct 2% processing fee using Function
        System.out.println("\n-- Amount after 2% processing fee --");
        List<Double> afterFee = transactions.stream()
                .map(deductProcessingFee)
                .collect(Collectors.toList());
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Original: ₹" + transactions.get(i) + " -> After 2% fee: ₹" + String.format("%.2f", afterFee.get(i)));
        }

        // 5. Apply discount on processing fee if customer has loyalty points.
        //  loyalty reduces fee to 1% (i.e., feePercentage = 1.0)
        System.out.println("\n-- Final amount after loyalty discount on fee --");
        double loyaltyFeePercent = 1.0; //  loyalty reduces fee to 1%
        transactions.forEach(amount -> {
            Double finalAmount = applyFeePercentage.apply(amount, loyaltyFeePercent);
            System.out.println("Amount: ₹" + amount + " with fee%: " + loyaltyFeePercent + " -> Final: ₹" + String.format("%.2f", finalAmount));
        });
    }
}
