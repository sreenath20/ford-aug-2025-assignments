package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class ExamSystem {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);

        List<Integer> sortedScores = scores.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toList());

        System.out.println("\nSorted scores (highest to lowest): " + sortedScores);
    }
}
