package day10Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TransactionAlert {
    public static void main(String[] args) {
        List<Double> transactions= Arrays.asList(5000.0,15000.0,250000.0,8000.0);
        Consumer<Double> alertAmount=(data)->{
            if(data>10000.0){
                System.out.println("Amount is greater than 10000: "+data);
            }
        };
        for(double transaction : transactions){
            alertAmount.accept(transaction);
        }

    }
}
