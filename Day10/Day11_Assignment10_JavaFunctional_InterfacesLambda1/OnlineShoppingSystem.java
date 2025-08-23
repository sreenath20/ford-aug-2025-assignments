package Day11_Assignment10_JavaFunctional_InterfacesLambda1;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class OnlineShoppingSystem {

    public static void main(String[] args) {
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0); // in USD

        // 1. Predicate<Double> – qualifies for free shipping if > ₹2000 (after conversion)
        Predicate<Double> isFreeShippingINR = priceINR -> priceINR > 2000.0;

        // 2. Consumer<Double> – print order confirmation (in INR)
        Consumer<Double> orderConfirmPrinter = priceINR ->
                System.out.println("Order placed successfully for ₹" + String.format("%.2f", priceINR));

        // 3. Supplier<String> – random coupon code like "SAVE123"
        Random rng = new Random();
        Supplier<String> couponSupplier = () -> "SAVE" + (rng.nextInt(900) + 100); // SAVE100..SAVE999

        // 4. Function<Double, Double> – convert USD to INR (1 USD = 83 INR)
        Function<Double, Double> usdToInr = usd -> usd * 83.0;

        // 5. BiFunction<Double, Double, Double> – apply percentage discount
        // (priceINR, discountPercent) -> finalPrice
        BiFunction<Double, Double, Double> applyDiscount = (priceINR, discountPercent) ->
                priceINR - (priceINR * discountPercent / 100.0);

        System.out.println("== Online Shopping Processing ==");

        // Convert USD to INR
        System.out.println("-- USD to INR conversion --");
        List<Double> ordersINR = ordersUSD.stream()
                .map(usdToInr)
                .collect(Collectors.toList());
        for (int i = 0; i < ordersUSD.size(); i++) {
            System.out.println(ordersUSD.get(i) + " USD -> ₹" + String.format("%.2f", ordersINR.get(i)));
        }

        // Check free shipping and print confirmations
        System.out.println("\n-- Free shipping & confirmations --");
        for (Double priceINR : ordersINR) {
            if (isFreeShippingINR.test(priceINR)) {
                System.out.println("Qualifies for free shipping: ₹" + String.format("%.2f", priceINR));
            } else {
                System.out.println("Does NOT qualify for free shipping: ₹" + String.format("%.2f", priceINR));
            }
            orderConfirmPrinter.accept(priceINR);
        }

        // Generate coupon codes for each order
        System.out.println("\n-- Coupons --");
        ordersINR.forEach(price -> System.out.println("Generated coupon for ₹" + String.format("%.2f", price) + ": " + couponSupplier.get()));

        // Apply discount (example: 10%)
        double discountPercent = 10.0;
        System.out.println("\n-- Final price after " + discountPercent + "% discount --");
        ordersINR.forEach(priceINR -> {
            Double finalPrice = applyDiscount.apply(priceINR, discountPercent);
            System.out.println("Original: ₹" + String.format("%.2f", priceINR) + " -> After " + discountPercent + "% discount: ₹" + String.format("%.2f", finalPrice));
        });
    }
}

