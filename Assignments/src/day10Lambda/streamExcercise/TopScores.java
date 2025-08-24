package day10Lambda.streamExcercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopScores {
    public static void main(String[] args) {
        List<Integer> scores= Arrays.asList(50,85,40,90,70);
        Comparator<Integer> scoreComparator=(n1,n2)->n2.compareTo(n1);
        List<Integer> sortedScores=scores
                .stream()
                .sorted(scoreComparator)
                .toList();
        System.out.println("Scores after sorting: "+sortedScores);


    }
}
