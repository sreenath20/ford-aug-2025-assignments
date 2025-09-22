package javatopic.day11_streamapi_lambda_functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Driver {

    public static void main(String[] args) {
        //FILTER HIGH SCORES

        //PREDICATE
//        Takes one parameter: number (an Integer from your list)
//        Returns a boolean: true if the number is >= 50, false otherwise
//        Tests a condition:

        // METHOD TEST
//        scores.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer number) {  // ← THIS is the method!
//                return number >= 50;
//            }
//        })
        List<Integer> scores = Arrays.asList(45,78,90,32,60,85);

        scores.stream().filter((number) -> number >= 50).forEach((number)->System.out.println(number));

//-------------------------------------------------------------------------------------------------------
        //CONSUMER<T>

//        @FunctionalInterface
//        public interface Consumer<T> {
//            void accept(T t);  // This is the method you're asking about!
//        }

        //.forEach((number) -> System.out.println("ALERT: Large transaction detected - " + number))
//        .forEach(new Consumer<Double>() {
//            @Override
//            public void accept(Double number) {  // ← THIS is the method!
//                System.out.println("ALERT: Large transaction detected - " + number);
//            }
//        })

        List<Double> transactions=Arrays.asList(5000.0,15000.0,25000.0,8000.0);

        transactions.stream().filter((number)->number> 10000).forEach((number)->System.out.println("ALERT: Large transcation Detect :"+number));
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //SUPPLIER<T>

//        @FunctionalInterface
//        public interface Supplier<T> {
//            T get();  // This is the method you're implementing!
//        }
    //() -> 1000 + new Random().nextInt(9000)

//        new Supplier<Integer>() {
//            @Override
//            public Integer get() {  // ← THIS is the method!
//                return 1000 + new Random().nextInt(9000);
//            }
//        }





        Supplier<Integer> numberGenerator =()-> 1000 + new Random().nextInt(9000);
        System.out.println("pin 1: "+numberGenerator.get());
        System.out.println("pin2 : "+numberGenerator.get());
//-------------------------------------------------------------------------------------


    }
}
