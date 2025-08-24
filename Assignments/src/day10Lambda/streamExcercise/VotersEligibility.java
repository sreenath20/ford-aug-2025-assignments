package day10Lambda.streamExcercise;

import java.util.Arrays;
import java.util.List;

public class VotersEligibility  {
    public static void main(String[] args) {
        List<Integer> ages= Arrays.asList(12,18,25,16,40,30);
        ages.stream().filter(age->age>18).forEach(System.out::println);

    }
}
