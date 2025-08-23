package Assignment10.StreamAPI.StudentMarkAnalysis;



import java.util.*;

public class StudentMarkAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        // 1. Filter passing marks (>= 50)
        List<Integer> passingMarks = marks.stream()
                .filter(m -> m >= 50)
                .toList();
        System.out.println("Passing Marks → " + passingMarks);

        // 2. Count how many students passed
        long passedCount = passingMarks.size();
        System.out.println("Passed Count → " + passedCount);

        // 3. Sort marks in ascending order
        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Marks → " + sortedMarks);

        // 4. Find the top score (highest)
        Optional<Integer> topScore = marks.stream().max(Integer::compareTo);
        System.out.println("Top Score → " + topScore.orElse(0));

        // 5. Names starting with "A"
        List<String> namesStartingWithA = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();
        System.out.println("Names starting with A → " + namesStartingWithA);

        // 6. Map marks into grades
        List<String> grades = marks.stream()
                .map(m -> {
                    if (m >= 85) return "A";
                    else if (m >= 70) return "B";
                    else if (m >= 50) return "C";
                    else return "Fail";
                })
                .toList();
        System.out.println("Grades → " + grades);
    }
}

