package Day11_Assignment10_JavaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SalesProcessing {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        // 1) Filter sales greater than 5000.0
        List<Double> filtered = sales.stream()
                .filter(s -> s > 5000.0)
                .collect(Collectors.toList());

        // 2) Sort sales in descending order
        List<Double> sortedDesc = filtered.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // 3) Convert each sale to include GST (18%)
        List<Double> withGst = sortedDesc.stream()
                .map(s -> s + s * 0.18) // s * 0.18 added
                .collect(Collectors.toList());

        // 4) Find the highest sale
        Optional<Double> highestSaleOpt = filtered.stream().max(Double::compare);
        Double highestSale = highestSaleOpt.orElse(null);

        // 5) Calculate the total sales amount (sum of all sales)
        Double totalSales = sales.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Filtered Sales (>5000) -> " + filtered);
        System.out.println("Sorted Sales (desc)   -> " + sortedDesc);
        System.out.println("With GST (18%)        -> " + withGst);
        System.out.println("Highest Sale          -> " + highestSale);
        System.out.println("Total Sales           -> " + totalSales);
    }
}
