package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class OnlineCourse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sudha", "vani", "giri");

        List<String> uppercaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nUppercase names: " + uppercaseNames);
    }
}
