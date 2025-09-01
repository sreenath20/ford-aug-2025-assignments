package com.demo.Assignment10.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class daily_sales_amount {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);
        sales.stream().filter((sale)->sale>5000.0).forEach((data)-> System.out.println(data));
        sales.stream().map((sale)->sale+sale*0.18).forEach((data)-> System.out.println(data));
        int sum=0;
        Double totalsum=sales.stream().mapToDouble((sale)->sale).sum();
        System.out.println("the total sum is"+totalsum);
        OptionalDouble maxSale=sales.stream().mapToDouble((sale)->sale).max();
        System.out.println("the max sale is"+maxSale);

        sales.stream().sorted().forEach((data)->System.out.println(data));




    }
}
