package com.harini.assignment11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SalesDataProcessing {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);
        List<Double> salesSorted = sales.stream().filter((sale)->sale>5000.0).sorted().map((sale)->sale*0.18).toList();
        Optional sum = salesSorted.stream().reduce((a, b)->a+b);
        Optional highest = salesSorted.stream().max(Double::compareTo);
        System.out.println(salesSorted);
        System.out.println("The sum of the sales is: "+sum);
        System.out.println("The highest of the sales is: "+highest);
    }
}
