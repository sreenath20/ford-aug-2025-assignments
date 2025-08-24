package com.harini;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {
        //Exercise1: Use filter()
        List<Integer> ages = Arrays.asList(12, 18, 25, 16, 40, 30);
        System.out.print("The eligible age to vote: ");
        List<Integer> eligibleTOVote=ages.stream().filter((age)->age>=18).toList();
        System.out.println(eligibleTOVote);

        //Exercise2: Use map()
        List<String> names = Arrays.asList("john", "emma", "alex");
        System.out.print("Tranforming names list into uppercase ");
        names.stream().map((name)->name.toUpperCase()).forEach((name)->System.out.print(name+" "));
        System.out.println();

        //Exercise3: Use sorted()
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        System.out.print("The high to low marks list: ");
        List<Integer> highScore = scores.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(highScore);

        //Exercise4: Use collect()
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List<String> booksStartsWithJ=books.stream().filter((book)->book.startsWith("J")).collect(Collectors.toList());
        System.out.println("Books start with the letter J: "+booksStartsWithJ);

        //Exercise5: reduce() to add the elements
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        Optional<Integer> sum = sales.stream().reduce((a, b)->a+b);
        System.out.println("The sum of the sales is: "+sum);

        //Exercise6: findFirst() to find the first student scored above 50
        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);
        Optional first50=marks.stream().filter((mark)->mark>50).findFirst();
        System.out.println("First to score above 50: "+first50);

    }
}
