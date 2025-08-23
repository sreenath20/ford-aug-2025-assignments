package com.assignment10_functionalinterfaces.excercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        System.out.println("Student Marks Analysis System");
        System.out.println("Original Marks: " + marks);
        System.out.println("Student Names: " + names);
        System.out.println();

        List<Integer> passingMarks = marks.stream()
                .filter(mark -> mark >= 50)
                .collect(Collectors.toList());
        System.out.println("Passing Marks: " + passingMarks);

        long passedCount = marks.stream()
                .filter(mark -> mark >= 50)
                .count();
        System.out.println("Passed Count: " + passedCount);

        List<Integer> sortedMarks = marks.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Marks: " + sortedMarks);

        Optional<Integer> topScore = marks.stream()
                .max(Integer::compareTo);
        System.out.println("Top Score: " + topScore.orElse(0));

        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with A: " + namesStartingWithA);

        List<String> grades = marks.stream()
                .map(mark -> {
                    if (mark >= 85) return "A";
                    else if (mark >= 70) return "B";
                    else if (mark >= 50) return "C";
                    else return "Fail";
                })
                .collect(Collectors.toList());
        System.out.println("Grades: " + grades);
    }
}
