package Day11Exercise_JavaStreamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamExercises {

    public static void main(String[] args) {

        eligibleVoters();
        uppercaseNames();
        topScoresDescending();
        booksStartingWithJ();
        totalSalesWithReduce();
        firstPassingScore();
    }

    // 1. Filtering Data – Eligible Voters
    static void eligibleVoters() {
        List<Integer> ages = Arrays.asList(12, 18, 25, 16, 40, 30);
        List<Integer> eligible = ages.stream()
                .filter(age -> age >= 18)
                .collect(Collectors.toList());

        System.out.println("Eligible voters: " + eligible);
    }

    // 2. Mapping Data – Uppercase Names
    static void uppercaseNames() {
        List<String> names = Arrays.asList("john", "emma", "alex");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase names: " + upper);
    }

    // 3. Sorting Data – Top Scores (descending)
    static void topScoresDescending() {
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        List<Integer> sortedDesc = scores.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Scores (high -> low): " + sortedDesc);
    }

    // 4. Collecting Data – Store Names in a List (starting with "J")
    static void booksStartingWithJ() {
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List<String> jBooks = books.stream()
                .filter(b -> b.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Books starting with J: " + jBooks);
    }

    // 5. Reducing Data – Total Sales
    static void totalSalesWithReduce() {
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        // Using reduce to sum
        int total = sales.stream()
                .reduce(0, Integer::sum); // or .reduce((a,b)->a+b).orElse(0)

        System.out.println("Total sales: " + total);
    }

    // 6. Finding Data – First Passing Score
    static void firstPassingScore() {
        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);
        Optional<Integer> firstPassing = marks.stream()
                .filter(m -> m > 50)
                .findFirst();

        if (firstPassing.isPresent()) {
            System.out.println("First passing mark: " + firstPassing.get());
        } else {
            System.out.println("No passing marks found.");
        }

        // Alternative concise print:
        // firstPassing.ifPresentOrElse(m -> System.out.println(m),
        //                              () -> System.out.println("No passing marks"));
    }
}

