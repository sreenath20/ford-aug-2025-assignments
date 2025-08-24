package day10Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CurrencyConverter {
    public static void main(String[] args) {
        List<Double> usdAmounts= Arrays.asList(10.0, 25.5, 100.0);
        Function<Double, Double> usdToInr = (digit)->{
            double inr=digit*83.0;
            return inr;
        };
        List<Double> inrAmounts=new ArrayList<>();
        for(double amount:usdAmounts){
            inrAmounts.add(usdToInr.apply(amount));
        }
        System.out.println("INR: "+inrAmounts);

    }
}
