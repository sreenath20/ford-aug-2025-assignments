package com.assignment8_collections.assignment2;

import java.util.Comparator;

public class authorAlphabeticOrder implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        return CharSequence.compare(o1.getAuthor(), o2.getAuthor());
    }
}
