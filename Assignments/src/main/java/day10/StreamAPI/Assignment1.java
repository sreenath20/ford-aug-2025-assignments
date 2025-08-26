package day10.StreamAPI;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        // 1. Filter sales > 5000
        List<Double> filteredSales = sales.stream()
                .filter(s -> s > 5000.0)
                .toList();
        System.out.println("Sale greater than 5000 : " + filteredSales);

        // 2. Sort sales in descending order.
        List<Double> sortedDesc = filteredSales.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted Sales in descending order : " + sortedDesc);

        // 3. Convert each sale into with GST included (sale + sale*0.18).
        List<Double> withGst = sortedDesc.stream()
                .map(s -> s + s * 0.18)
                .toList();
        System.out.println("With GST : " + withGst);

        // 4. Find the highest sale.
        Optional<Double> maxSale = sales.stream().max(Double::compareTo);
        System.out.println("Highest Sale: " + maxSale.orElse(0.0));

        // 5. Calculate the total sales amount (sum).
        double total = sales.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Sales: " + total);
    }
}
