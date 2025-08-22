package com.ford.assignment10;

import java.util.*;
import java.util.stream.*;

public class SalesDataProcessing {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        // 1. Filter sales > 5000
        List<Double> filteredSales = sales.stream()
                .filter(s -> s > 5000.0)
                .toList();

        // 2. Sort descending
        List<Double> sortedSales = filteredSales.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        // 3. Add GST (18%)
        List<Double> salesWithGST = sortedSales.stream()
                .map(s -> s + s * 0.18)
                .toList();

        // 4. Highest sale
        Double highestSale = sales.stream()
                .max(Double::compareTo)
                .orElse(0.0);

        // 5. Total sales
        Double totalSales = sales.stream()
                .reduce(0.0, Double::sum);

        // Output
        System.out.println("Filtered Sales (>5000): " + filteredSales);
        System.out.println("Sorted Sales (desc): " + sortedSales);
        System.out.println("With GST: " + salesWithGST);
        System.out.println("Highest Sale: " + highestSale);
        System.out.println("Total Sales: " + totalSales);
    }
}
