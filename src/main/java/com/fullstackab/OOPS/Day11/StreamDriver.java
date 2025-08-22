package com.fullstackab.OOPS.Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDriver {
    public static void main(String[] args) {
        List<Integer> ageList = new ArrayList<>();
        ageList.add(12);
        ageList.add(18);
        ageList.add(25);
        ageList.add(16);
        ageList.add(40);
        ageList.add(30);
        // Filtering Data – Eligible Voters
        ageList
                .stream()
                .filter((number) -> number >= 18)
                .forEach((num) -> System.out.println("Person with age " + num + " Can Vote"));
        // Mapping Data – Uppercase Names
        //List<String> names = new ArrayList<>();
        List<String> names = Arrays.asList("john", "emma", "alex");
        names
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Sorting Data – Top Scores
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        scores
                .stream()
                .sorted()
                .forEach(score -> System.out.println(score));

        // Collecting Data – Store Names in a List
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List<String> jBooks = books
                .stream()
                .filter(book -> book.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(jBooks);

        // Reducing Data – Total Sales
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        int totalSales = sales
                .stream()
                // .reduce((s1, s2) -> s1 + s2);
                .reduce(0, (x, y) -> x + y);
        System.out.println(totalSales);

        // Finding Data – First Passing Score
        List<Integer> marks = Arrays.asList(40, 45, 60, 75, 40);
        Optional<Integer> marks1 =
                marks
                        .stream()
                        .filter(mark -> mark > 50)
                        .findFirst();
        System.out.println(marks1);
//        Learning Summary of Java Stream API
//        1. filter() → Select items based on a condition.
//        2. map() → Transform elements (e.g., lowercase → uppercase, numbers → squared).
//        3. sorted() → Arrange elements (ascending/descending).
//        4. collect() → Gather results into a List, Set, or Map.
//        5. reduce() → Combine elements into one (sum, product, max).
//        6. findFirst() / findAny() → Retrieve specific elements

    }
}
