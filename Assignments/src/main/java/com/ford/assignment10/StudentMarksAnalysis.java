package com.ford.assignment10;

import java.util.*;
import java.util.stream.*;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        // 1. Filter passing marks (>= 50)
        List<Integer> passingMarks = marks.stream()
                .filter(m -> m >= 50)
                .toList();

        // 2. Count passed students
        long passedCount = passingMarks.size();

        // 3. Sort marks ascending
        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .toList();

        // 4. Top score
        Integer topScore = marks.stream()
                .max(Integer::compareTo)
                .orElse(0);

        // 5. Names starting with "A"
        List<String> namesStartingWithA = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();

        // 6. Map marks to grades
        List<String> grades = marks.stream()
                .map(m -> {
                    if (m >= 85) return "A";
                    else if (m >= 70) return "B";
                    else if (m >= 50) return "C";
                    else return "Fail";
                })
                .toList();

        // Output
        System.out.println("Passing Marks: " + passingMarks);
        System.out.println("Passed Count: " + passedCount);
        System.out.println("Sorted Marks: " + sortedMarks);
        System.out.println("Top Score: " + topScore);
        System.out.println("Names starting with A: " + namesStartingWithA);
        System.out.println("Grades: " + grades);
    }
}
