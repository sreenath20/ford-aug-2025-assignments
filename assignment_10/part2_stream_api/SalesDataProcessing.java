package assignment_10.part2_stream_api;

import java.util.*;
import java.util.stream.*;

public class SalesDataProcessing {
    public static void main(String[] args) {

        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        //Filter sales greater than 5000
        List<Double> filteredSales = sales.stream()
                .filter(sale -> sale > 5000.0)
                .collect(Collectors.toList());
        System.out.println("\nFiltered Sales (>5000): " + filteredSales);

        //Sort sales in descending order
        List<Double> sortedSales = filteredSales.stream()
                .sorted((a, b) -> Double.compare(b, a))
                .collect(Collectors.toList());
        System.out.println("Sorted Sales (desc): " + sortedSales);

        //Convert each sale with GST included (sale + sale*0.18)
        List<Double> salesWithGST = sortedSales.stream()
                .map(sale -> sale + sale * 0.18)
                .collect(Collectors.toList());
        System.out.println("With GST: " + salesWithGST);

        //Find the highest sale
        Double highestSale = sales.stream()
                .max(Double::compare)
                .orElse(0.0);
        System.out.println("Highest Sale: " + highestSale);

        //Calculate total sales amount
        Double totalSales = sales.stream()
                .reduce(0.0, Double::sum);
        System.out.println("Total Sales: " + totalSales);
    }
}
