package com.harini.assignment11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MarkAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");
        Long count = marks.stream().filter((mark)->mark>=50).count();
        System.out.println(count);
        List<Integer> sortedMarks = marks.stream().sorted().toList();
        System.out.println(sortedMarks);
        Optional topScore = sortedMarks.stream().max(Integer::compareTo);
        System.out.println(topScore);
        List<String> namesWithA = names.stream().filter((name)->name.startsWith("A")).toList();
        System.out.println(namesWithA);
        List<String> grades= marks.stream().map((mark)->mark>=85?"A" :mark>=70?"B":mark>=50?"C":"Fail").toList();
        System.out.println(grades);


    }
}
