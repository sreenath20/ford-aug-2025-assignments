package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class GradeSystem {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);

        Integer firstPassingMark = marks.stream()
                .filter(mark -> mark > 50)
                .findFirst()
                .orElse(0);

        System.out.println("\nFirst passing mark: " + firstPassingMark);
    }
}
