package ExerciseJavaMap2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LibraryMapsDemo {

    static class Book {
        private final Integer id;
        private final String title;
        private final String author;

        public Book(Integer id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        public Integer getId() { return id; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }

        @Override
        public String toString() {
            return id + " → " + title + " by " + author;
        }
    }

    public static void main(String[] args) {
        Book b3 = new Book(3, "Java Programming", "James Gosling");
        Book b1 = new Book(1, "Data Structures", "Robert Lafore");
        Book b4 = new Book(4, "Spring Boot", "Pivotal Team");
        Book b2 = new Book(2, "Algorithms", "CLRS");

        // no guaranteed order
        Map<Integer, Book> hashMap = new HashMap<>();
        hashMap.put(3, b3);
        hashMap.put(1, b1);
        hashMap.put(4, b4);
        hashMap.put(2, b2);

        System.out.println("HashMap contents (order NOT guaranteed):");
        System.out.println(hashMap); // Map.toString() will call Book.toString() for values


        System.out.println("Iterating HashMap entries:");
        for (Map.Entry<Integer, Book> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n----------------------------------\n");

        // preserves insertion order
        Map<Integer, Book> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, b3);
        linkedHashMap.put(1, b1);
        linkedHashMap.put(4, b4);
        linkedHashMap.put(2, b2);

        System.out.println("LinkedHashMap contents (insertion order preserved):");
        System.out.println(linkedHashMap);

        System.out.println("Iterating LinkedHashMap entries:");
        for (Map.Entry<Integer, Book> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n----------------------------------\n");

        // sorted by key
        Map<Integer, Book> treeMap = new TreeMap<>();
        treeMap.put(3, b3);
        treeMap.put(1, b1);
        treeMap.put(4, b4);
        treeMap.put(2, b2);

        System.out.println("TreeMap contents (sorted by key - Book ID):");
        System.out.println(treeMap);

        System.out.println("Iterating TreeMap entries:");
        for (Map.Entry<Integer, Book> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
