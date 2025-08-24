package day10Lambda.streamExcercise;

import java.util.Arrays;
import java.util.List;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("john","emma","alex");
        names.stream().map((name)->(name.toUpperCase())).forEach(System.out::println);
    }
}
