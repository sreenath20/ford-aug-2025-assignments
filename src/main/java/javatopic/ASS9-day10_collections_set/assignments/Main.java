package javatopic.day10_collections_set.assignments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name1="hello";
       // Function<String,Integer> stringLength=(name1)->name1.length();

        //System.out.println(stringLength.apply("ford"));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(5);
        integerList.add(8);
        integerList.add(1);


        integerList.stream()
                .map(i->i*i)
                .forEach(System.out::println);



    }

}
