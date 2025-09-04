package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class LibraryBooks {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++");

        List<String> booksStartingWithJ = books.stream()
                .filter(book -> book.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("\nBooks starting with J: " + booksStartingWithJ);
    }
}

