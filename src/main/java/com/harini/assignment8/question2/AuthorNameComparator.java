package com.harini.assignment8.question2;

import java.util.Comparator;

public class AuthorNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}
