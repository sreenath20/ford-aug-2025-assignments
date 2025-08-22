package com.assignments.assignment10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDriver {

    static void SalesDataProcessing(){

        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        System.out.println("Filter sales(>5000) : "+
                sales.stream().filter(s->s>5000).toList());

        Comparator<Double> salesComparator = (s1,s2)-> -s1.compareTo(s2);
        System.out.println("Sorted sales(desc) : "+
                sales.stream().sorted(salesComparator).toList());

        System.out.println("With GST 18% : "+
                sales.stream().map(s->s+s*0.18).toList());

        System.out.println("Highest Sale : "+
                sales.stream().mapToDouble(Double::valueOf).max());

        System.out.println("Total Sales : "+
                sales.stream().mapToDouble(Double::valueOf).sum());
    }

    static void StudentMarkAnalysis(){

        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        System.out.println("Passing marks(>50) : "+
                marks.stream().filter(m->m>50).toList());

        System.out.println("Passed Count : "+
                marks.stream().filter(m->m>50).count());

        System.out.println(("Sorted marks : "+
                marks.stream().sorted().toList()));

        System.out.println("Top Score : "+
                marks.stream().mapToDouble(Double::valueOf).max());

        System.out.println("Name starting with 'A' : "+
                names.stream().filter(n->n.startsWith("A")).toList());

        List<String> grades = marks
                .stream()
                .map((m)->{
                    if(m>=85) return "A";
                    else if (m>=70) return "B";
                    else if (m>=50) return "C";
                    return "Fail";
                }).toList();

        System.out.println("Grades : "+grades);


    }
    public static void main(String[] args) {
        SalesDataProcessing();
        StudentMarkAnalysis();
    }
}
