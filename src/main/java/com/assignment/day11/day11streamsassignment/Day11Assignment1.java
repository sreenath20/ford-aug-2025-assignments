package com.assignment.day11.day11streamsassignment;

import java.util.*;

public class Day11Assignment1 {
    public static void main(String[] args) {

        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        //Filter sales greater than 5000.0
        System.out.println("Sales greater than 5000");
        sales.stream().filter(sale->sale>5000)
                .forEach(sale -> System.out.println(sale));

        //sort sale in descending order
        System.out.println("Sales sorted in descending order:");
        sales.stream().sorted(Comparator.reverseOrder()).forEach(sale -> System.out.println(sale));

        //convert each sale into gst included
        System.out.println("Sales included gst:");
        sales.stream()
                .forEach(sale -> System.out.println(sale+(sale*0.18)));

        //find highest sale
        System.out.println("Maximum sale");
        Optional<Double> maxOpt = sales.stream().max(Double::compare);
        if(maxOpt.isPresent()) {
            System.out.println(maxOpt.get());
        }

        //total sales amount
        Double sum=sales.stream().mapToDouble(sale->sale).sum();
        System.out.println("Total sales: "+sum);

    }
}
