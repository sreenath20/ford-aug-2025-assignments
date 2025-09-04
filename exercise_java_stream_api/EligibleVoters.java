package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class EligibleVoters {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(12, 18, 70, 25, 16, 30, 40);

        List<Integer> eligibleAges = ages.stream()
                .filter(age -> age >= 18)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nEligible ages: " + eligibleAges);
    }
}
