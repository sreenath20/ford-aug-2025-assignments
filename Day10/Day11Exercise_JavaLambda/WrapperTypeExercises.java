package Day11Exercise_JavaLambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.concurrent.ThreadLocalRandom;

public class WrapperTypeExercises {

    public static void main(String[] args) {
        filterHighScores();
        alertsForLargeTransactions();
        generateRandomPins();
        convertUsdToInr();
        calculateDiscountedPrice();
    }

    // 1. Predicate<T> – Filter High Scores
    static void filterHighScores() {
        List<Integer> scores = Arrays.asList(45, 78, 90, 32, 60, 85);
        Predicate<Integer> pass = s -> s >= 50;

        List<Integer> passingScores = scores.stream()
                .filter(pass)
                .collect(Collectors.toList());

        System.out.println("Passing scores: " + passingScores);

        // Predicate<Integer> encapsulates a boolean test and can be reused.
    }

    // 2. Consumer<T> – Send Alerts for Large Transactions
    static void alertsForLargeTransactions() {
        List<Double> transactions = Arrays.asList(5000.0, 15000.0, 25000.0, 8000.0);
        Predicate<Double> isLarge = amt -> amt > 10000.0;
        Consumer<Double> alert = amt -> System.out.println("ALERT: Large transaction detected - " + amt);

        // Filter with Predicate, then execute Consumer for each matching item
        transactions.stream()
                .filter(isLarge)
                .forEach(alert);


        //  Combine Predicate for selection and Consumer for side-effecting action.
    }

    // 3. Supplier<T> – Generate Random PIN
    static void generateRandomPins() {
        Supplier<Integer> pinSupplier = () -> ThreadLocalRandom.current().nextInt(1000, 10000); // 1000..9999

        System.out.print("Generated PINs: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(pinSupplier.get());
            if (i < 2) System.out.print(", ");
        }
        System.out.println();

        // numbers will vary

        // Supplier<T> produces values on demand without any input.
    }

    // 4. Function<T, R> – Convert Currency (USD -> INR)
    static void convertUsdToInr() {
        List<Double> usdAmounts = Arrays.asList(10.0, 25.5, 100.0);
        final double RATE = 83.0; // 1 USD = 83 INR (assumed)

        Function<Double, Double> usdToInr = usd -> usd * RATE;

        List<Double> inrAmounts = usdAmounts.stream()
                .map(usdToInr)
                .collect(Collectors.toList());

        System.out.println("INR amounts: " + inrAmounts);

        //  Function<T,R> transforms input values into results (wrapper types preserved).
    }

    // 5. BiFunction<T, U, R> – Calculate Discounted Price
    static void calculateDiscountedPrice() {
        BiFunction<Double, Double, Double> discountCalc =
                (originalPrice, discountPercentage) -> originalPrice - (originalPrice * discountPercentage / 100.0);

        Double p1 = discountCalc.apply(2000.0, 20.0);
        Double p2 = discountCalc.apply(1500.0, 10.0);

        System.out.println("Final price (2000.0 with 20%): " + p1);
        System.out.println("Final price (1500.0 with 10%): " + p2);


        //  BiFunction accepts two inputs and returns a result.
    }
}
