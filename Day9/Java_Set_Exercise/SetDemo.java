package Java_Set_Exercise;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // Emails list (note raj@company.com appears twice to demonstrate de-duplication)
        List<String> emails = Arrays.asList(
                "raj@company.com",
                "priya@company.com",
                "amit@company.com",
                "raj@company.com",   // duplicate
                "zara@company.com"
        );

        // 1. HashSet (no particular order)
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(emails);

        // 2. LinkedHashSet (preserves insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(emails);

        // 3. TreeSet (sorted order - natural ordering of strings)
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(emails);

        // Print initial sets
        System.out.println("HashSet output: " + hashSet);
        System.out.println("LinkedHashSet output: " + linkedHashSet);
        System.out.println("TreeSet output: " + treeSet);

        // Check membership for "amit@company.com"
        String check = "amit@company.com";
        System.out.println();
        System.out.println("Does HashSet contain '" + check + "'? " + hashSet.contains(check));
        System.out.println("Does LinkedHashSet contain '" + check + "'? " + linkedHashSet.contains(check));
        System.out.println("Does TreeSet contain '" + check + "'? " + treeSet.contains(check));

        // Remove "raj@company.com" from all sets
        String remove = "raj@company.com";
        hashSet.remove(remove);
        linkedHashSet.remove(remove);
        treeSet.remove(remove);

        System.out.println();
        System.out.println("After removing '" + remove + "':");
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        // Extra demonstration: sizes to show duplicate was not stored
        System.out.println();
        System.out.println("Sizes after initial insertion:");
        System.out.println("HashSet size: " + hashSet.size());
        System.out.println("LinkedHashSet size: " + linkedHashSet.size());
        System.out.println("TreeSet size: " + treeSet.size());
    }
}
