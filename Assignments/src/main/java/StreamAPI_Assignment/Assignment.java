package StreamAPI_Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {

        // 1. Filtering Data – Eligible Voters
        // Scenario:
        // A government system has a list of people’s ages. Only those 18 and above are eligible to vote
        List<Integer> ages = Arrays.asList(12, 18, 25, 16, 40, 30);
        List<Integer> eligibleAges = ages.stream().filter((age) -> age >= 18).toList();
        System.out.println("1. Eligible ages for voting are : " + eligibleAges);


        // 2. Mapping Data – Uppercase Names
        // Scenario:
        // An online course platform wants to display student names in uppercase.
        List<String> names = Arrays.asList("john", "emma", "alex");
        List <String> uppercaseNames= names.stream().map((String name) -> name.toUpperCase()).toList();
        System.out.println("2. Names in UpperCase : " + uppercaseNames);


        // 3. Sorting Data – Top Scores
        // Scenario:
        // An exam system wants to display student scores in descending order.
        Comparator<Integer> scoreComparator = (Integer num1, Integer num2) -> num1.compareTo (num2);
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        List <Integer> sortedScores = scores.stream().sorted(scoreComparator).toList();
        System.out.println("3. Students scores sorted in descending order : " + sortedScores);


        // 4. Collecting Data – Store Names in a List
        // Scenario:
        // A library has a list of book titles. They want to collect all titles starting with "J" into a new list.
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List<String> booksStartingWithJ = books.stream().filter(book -> book.startsWith("J")).collect(Collectors.toList());
        System.out.println("4. Books starting with letter 'J' : " + booksStartingWithJ);


        // 5. Reducing Data – Total Sales
        // Scenario:
        // A shop records daily sales amounts. The manager wants to find the total sales for the week.
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        int totalSales = sales.stream().reduce(0, (a, b) -> a + b);
        System.out.println("5. Total Sales for the Week : " + totalSales);


        // 6. Finding Data – First Passing Score
        // Scenario:
        // An exam system wants to find the first student who scored above 50.
        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);
        Integer firstPass = marks.stream().filter(mark -> mark > 50).findFirst().orElse(null);
        System.out.println("6. First Student scoring above 50 : " + firstPass);

    }
}
