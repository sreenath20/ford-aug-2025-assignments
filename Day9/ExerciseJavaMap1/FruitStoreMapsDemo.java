package ExerciseJavaMap1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FruitStoreMapsDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Banana");
        hashMap.put(1, "Apple");
        hashMap.put(4, "Mango");
        hashMap.put(2, "Orange");

        System.out.println("HashMap Output:");
        System.out.println(hashMap); // order is not guaranteed

        // insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Banana");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(4, "Mango");
        linkedHashMap.put(2, "Orange");

        System.out.println("\nLinkedHashMap Output:");
        System.out.println(linkedHashMap); // preserves insertion order

        // sorted by key
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(4, "Mango");
        treeMap.put(2, "Orange");

        System.out.println("\nTreeMap Output:");
        System.out.println(treeMap);
    }
}
