package com.demo.Assignment8;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice().compareTo(o2.getPrice());    }
}