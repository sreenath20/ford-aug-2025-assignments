package Day11_Assignment10_JavaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        // 1) Filter passing marks (>= 50)
        List<Integer> passing = marks.stream()
                .filter(m -> m >= 50)
                .collect(Collectors.toList());

        // 2) Count how many students passed
        long passedCount = marks.stream()
                .filter(m -> m >= 50)
                .count();

        // 3) Sort marks in ascending order
        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .collect(Collectors.toList());

        // 4) Find the top score (highest)
        Optional<Integer> topScoreOpt = marks.stream().max(Integer::compare);
        Integer topScore = topScoreOpt.orElse(null);

        // 5) From names list -> collect names starting with "A"
        List<String> namesStartingWithA = names.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());

        // 6) Map marks into grades:
        // >=85 -> A, >=70 -> B, >=50 -> C, <50 -> Fail
        List<String> grades = marks.stream()
                .map(m -> {
                    if (m >= 85) return "A";
                    if (m >= 70) return "B";
                    if (m >= 50) return "C";
                    return "Fail";
                })
                .collect(Collectors.toList());

        System.out.println("Passing Marks         -> " + passing);
        System.out.println("Passed Count          -> " + passedCount);
        System.out.println("Sorted Marks          -> " + sortedMarks);
        System.out.println("Top Score             -> " + topScore);
        System.out.println("Names starting with A -> " + namesStartingWithA);
        System.out.println("Grades                -> " + grades);
    }
}

