package Assignment10.StreamAPI.SalesDataProcessing;


import java.util.*;

public class SalesProcessor {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        // 1. Filter sales > 5000
        List<Double> filteredSales = sales.stream()
                .filter(s -> s > 5000.0)
                .toList();
        System.out.println("Filtered Sales>5000: " + filteredSales);

        // 2. Sort descending
        List<Double> sortedDesc = filteredSales.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted Sales desc: " + sortedDesc);

        // 3. Add GST (18%)
        List<Double> withGst = sortedDesc.stream()
                .map(s -> s + s * 0.18)
                .toList();
        System.out.println("With GST (18%): " + withGst);

        // 4. Highest sale
        Optional<Double> maxSale = sales.stream().max(Double::compareTo);
        System.out.println("Highest Sale: " + maxSale.orElse(0.0));

        // 5. Total sales
        double total = sales.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Sales: " + total);
    }
}

