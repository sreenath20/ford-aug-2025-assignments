package com.demo.Assignment8;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookauthor().compareTo(o2.getBookauthor());
    }
}
