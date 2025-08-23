package day10_streams;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDriver {
    public static void main(String[] args) {
        Demofunction demo = new demo();
        demo.display();
        Demofunction function = () -> System.out.println("ford india using lambda expression");
        function.display();
        Consumer<Integer> consumer = (data) -> System.out.println("Consumer: " + data);
        consumer.accept(100);
        Supplier<Double> supplier = () -> 3.14;
        System.out.println("Supplier: " + String.valueOf(supplier.get()));
        Predicate<Integer> predicate = (data) -> data % 2 == 0;
        System.out.println("Predicate: " + predicate.test(10));
        System.out.println("Predicate: " + predicate.test(11));
        Function<String, Integer> function1 = (data) -> data.length();
        System.out.println("Function: " + String.valueOf(function1.apply("Hello World")));
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(biFunction.apply(10, 20));
        var10000.println("BiFunction: " + var10001);
    }
}