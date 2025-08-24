package day10Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ScoreCheck {
    public static void main(String[] args) {
        List<Integer> scores= Arrays.asList(45,78,90,32,60,85);
        Predicate<Integer> passPredicate= (number)->(number>=50);
        for(int score:scores){
            if(passPredicate.test(score)){
                System.out.println("This score is eligible as per criteria: "+score);
            }
        }
    }
}
