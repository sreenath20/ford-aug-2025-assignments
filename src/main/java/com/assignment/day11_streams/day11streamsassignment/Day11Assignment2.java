package com.assignment.day11_streams.day11streamsassignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Day11Assignment2 {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        //filter passing marks
        System.out.println("Passing Marks : ");
        marks.stream().filter(mark->mark>=50)
                .forEach(mark->System.out.println(mark));

        //count how many students passed
        Integer count=marks.stream().filter(mark->mark>=50)
                .mapToInt(mark->1).sum();
        System.out.println("No of students passed : "+count);

        //sort marks in ascending order
        System.out.println("Marks sorted in ascending order : ");
        marks.stream().sorted()
                .forEach(mark->System.out.println(mark));

        //find the top score
        System.out.println("Top score : ");
        Optional<Integer> topScore = marks.stream().max(Double::compare);
        if(topScore.isPresent()){
            System.out.println(topScore.get());
        }

        //collect names starting with A
        System.out.println("Names starting with A : ");
        names.stream().filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        //Map mark into grades
        Function<Integer,String> gradeMapping = (mark) -> mark>=85 ? "A" : mark>=70 ? "B" : mark>=50 ? "C" : "Fail" ;
        System.out.println("Mapping mark into grades : ");
        List<String> gradesList = marks.stream()
                .map(mark->gradeMapping.apply(mark))
                .toList();
        System.out.println("Grades List : "+gradesList);


    }
}
