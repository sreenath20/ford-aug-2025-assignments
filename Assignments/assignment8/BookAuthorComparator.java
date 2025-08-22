package com.assignments.assignment8;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}
