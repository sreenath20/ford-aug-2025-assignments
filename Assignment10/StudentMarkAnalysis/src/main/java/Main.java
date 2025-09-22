//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John", "Emma", "Alex", "Sophia", "Liam", "Olivia");
        System.out.println("-----------------------------------------");
        System.out.println("Student Marks Analysis");
        System.out.println("-----------------------------------------");
        List<Integer> passedMarks = marks.stream().filter(mark -> mark >= 50).toList();
        System.out.println("Passing Marks ->" + passedMarks);

        Integer countOfPassedStudents = passedMarks.size();
        System.out.println("Count of Students Passed : " + countOfPassedStudents);

        List<Integer> sortedMarks = marks.stream().sorted().toList();
        System.out.println("Sorted Marks : " + sortedMarks);

        Integer highestMark = sortedMarks.get(sortedMarks.size() - 1);

        List<String> studentNamesStartsWithA = names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println("Names starting with A ->" + studentNamesStartsWithA);

        List<String> studentGrades = marks.stream().map(mark -> {
            if (mark >= 85) return "A";
            else if (mark >= 70) return "B";
            else if (mark >= 50) return "C";
            else return "Fail";
        }).toList();
        System.out.println("Student Grades ->" + studentGrades);
        System.out.println("------------------------------------------");
    }
}