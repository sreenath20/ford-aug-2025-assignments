package day10_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamDriver {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        names.add("dddd");
        names.stream().map((name) -> name.length()).forEach((data) -> System.out.println(data));
        Integer sum = names.stream().mapToInt((name) -> name.length()).sum();
        System.out.println("Total length of all names: " + sum);
        OptionalInt min = names.stream().mapToInt((name) -> name.length()).min();
        if (min.isPresent()) {
            System.out.println("Minimum length of all names: " + min.getAsInt());
        } else {
            System.out.println("No names available to find minimum length.");
        }

        System.out.println("Minimum length of all names: " + min.getAsInt());
        List<Integer> numbers = names.stream().map((name) -> name.length()).toList();
        System.out.println("List of lengths: " + String.valueOf(numbers));
        names.stream().filter((name) -> name.length() > 3).forEach((name) -> System.out.println(name));
        List<Integer> integerlist = new ArrayList();
        integerlist.add(25);
        integerlist.add(15);
        integerlist.add(20);
        System.out.println("display even numbers");
        integerlist.stream().filter((number) -> number % 2 == 0).forEach((number) -> System.out.println(number));
        System.out.println("display in sorted  numbers");
        integerlist.stream().sorted().forEach((number) -> System.out.println(number));
        System.out.println("Int list is not sorted: " + String.valueOf(integerlist));
    }
}
