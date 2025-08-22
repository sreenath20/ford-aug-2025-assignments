package com.assignments.assignment8;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }
}
