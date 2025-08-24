package day11_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");

        List<Integer> passingMarks=marks.stream().filter(a->a>=50).collect(Collectors.toList());
        System.out.println("Passing Marks-> "+passingMarks);

        Long count = marks.stream().filter((mark)->mark>=50).count();
        System.out.println("Passed Count ->"+count);

        List<Integer> sortedMarks = marks.stream().sorted().toList();
        System.out.println("Sorted Marks ->"+sortedMarks);

        Optional topScore = sortedMarks.stream().max(Integer::compareTo);
        System.out.println("Top Score ->"+topScore);

        List<String> namesWithA = names.stream().filter((name)->name.startsWith("A")).toList();
        System.out.println("Names starting with A ->"+namesWithA);

        List<String> grades= marks.stream().map((mark)->mark>=85?"A" :mark>=70?"B":mark>=50?"C":"Fail").toList();
        System.out.println("Grades->"+grades);


    }
}
