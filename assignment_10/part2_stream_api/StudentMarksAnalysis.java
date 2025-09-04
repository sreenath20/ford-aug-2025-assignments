package assignment_10.part2_stream_api;

import java.util.*;
import java.util.stream.*;

public class StudentMarksAnalysis {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("Anusha", "Deepa", "Nithish", "Priya", "Sharu", "Mithra");

        //Filter passing marks (>= 50)
        List<Integer> passingMarks = marks.stream()
                .filter(mark -> mark >= 50)
                .collect(Collectors.toList());
        System.out.println("\nPassing Marks: " + passingMarks);

        //Count how many students passed
        Long passedCount = marks.stream()
                .filter(mark -> mark >= 50)
                .count();
        System.out.println("Passed Count: " + passedCount);

        //Sort marks in ascending order
        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nSorted Marks: " + sortedMarks);

        //Find the top score (highest)
        Integer topScore = marks.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Top Score: " + topScore);

        //Collect names starting with "A"
        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("\nNames starting with A: " + namesWithA);

        System.out.println("\nMarks: "+ marks);
        //Map marks into grades
        List<String> grades = marks.stream()
                .map(mark -> {
                    if (mark >= 85) return "A";
                    else if (mark >= 70) return "B";
                    else if (mark >= 50) return "C";
                    else return "F";
                })
                .collect(Collectors.toList());
        System.out.println("Grades: " + grades);
    }
}
