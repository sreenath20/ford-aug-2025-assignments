package com.fullstackabi.assignment.Assign10.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalesDataProcess {

    public static void main(String[] args) {

        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        //. Filter sales greater than 5000.0.
        System.out.println("Sales above 5000.00 ");
        sales.stream().filter(sale -> sale > 5000.0)
                .forEach(sale -> {
                    System.out.println(sale);
                });
        //. Sort sales in descending order.
        System.out.println("SAles in Descending order");
        sales.stream().sorted(Comparator.reverseOrder()).forEach(sale -> {
            System.out.println(sale);
        });

        //Convert each sale into with GST included (sale + sale*0.18).
        System.out.println("Sales with GST included");
        sales.stream().map(sale -> sale + sale * 0.18)
                .forEach(sale -> {
                    System.out.println(sale);
                });

        //Find the highest sale.
        System.out.println("High Sales");
        sales.stream().max(Comparator.comparing(Double::valueOf))
                .stream().toList().forEach(System.out::println);

        // Calculate the total sales amount (sum).
        System.out.println("Sum of Sales");
      //  Double totalSales = sales.stream().mapToDouble(Double::valueOf).sum();
        Double totalSales = sales.stream().reduce(0.0, Double::sum);
        System.out.println(totalSales);

    }
}
