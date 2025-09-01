package com.demo.Assignment10.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMarksAnalysis {

    public static void main(String[] args){
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        marks
                .stream()
                .filter((mark) -> mark >= 50)
                .forEach((mark)->{
                    System.out.println(mark);
                });
        Long counts=marks.stream().filter((mark)->mark>=50).count();
        System.out.println("Passed Count: "+counts);
        marks.stream().sorted().forEach((data)-> System.out.print(data+" "));
       Integer highest= marks.stream().mapToInt((data)->data).max().getAsInt();
        System.out.println("Top Score: "+highest);
        List<String> lists= new ArrayList<>();
        names.stream().filter((name)->{return name.charAt(0)=='A';}).forEach((name)->lists.add(name));
        System.out.println("Names starting with A: "+lists);

        marks.stream().map(mark -> {
            if (mark >= 85) return "A";
            else if (mark >= 70) return "B";
            else if (mark >= 60) return "C";
            else if (mark >= 50) return "D";
            else return "Fail";
        })
                .forEach(System.out::println);
    }
}
