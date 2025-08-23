package com.assignment10_functionalinterfaces.excercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class salesDataprocessing {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        System.out.println("Sales Data Processing System\n");
        System.out.println("Original Sales: " + sales);

        List<Double> filteredSales = sales.stream()
                .filter(sale -> sale > 5000.0)
                .collect(Collectors.toList());
        System.out.println("Filtered Sales (>5000): " + filteredSales);

        List<Double> sortedSales = filteredSales.stream()
                .sorted((a, b) -> Double.compare(b, a))
                .collect(Collectors.toList());
        System.out.println("Sorted Sales (desc): " + sortedSales);

        List<Double> salesWithGST = sortedSales.stream()
                .map(sale -> sale + (sale * 0.18))
                .collect(Collectors.toList());
        System.out.println("With GST: " + salesWithGST);

        Optional<Double> highestSale = sales.stream()
                .max(Double::compareTo);
        System.out.println("Highest Sale: " + highestSale.orElse(0.0));

        Double totalSales = sales.stream()
                .reduce(0.0, Double::sum);
        System.out.println("Total Sales: " + totalSales);
    }
}
